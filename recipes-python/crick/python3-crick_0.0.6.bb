SUMMARY = "High performance approximate and streaming algorithms"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0eaa5dc0edfd1b217f12d45ae54ec1b4"

DEPENDS = " \
	python3-cython-native python3-versioneer-native \
	python3-numpy-native python3-setuptools-scm-native \
"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "851bc0802cd4dfb17f8fe99934b224dc355c84de0174ea5d9723b25c7feeb516"

do_install:append () {
	sed -i \
		-e 's:${RECIPE_SYSROOT_NATIVE}::g' \
		-e 's:${RECIPE_SYSROOT}::g' \
		${D}${PYTHON_SITEPACKAGES_DIR}/crick/space_saving.c \
		${D}${PYTHON_SITEPACKAGES_DIR}/crick/stats.c \
		${D}${PYTHON_SITEPACKAGES_DIR}/crick/tdigest.c \
		${S}/crick/space_saving.c \
		${S}/crick/stats.c \
		${S}/crick/tdigest.c
}

RDEPENDS:${PN} = " \
	python3-numpy \
"
