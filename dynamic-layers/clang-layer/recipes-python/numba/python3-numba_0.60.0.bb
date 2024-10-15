SUMMARY = "compiling Python code using LLVM"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d9bed34136e8491d5d792c7efc17f10c"

DEPENDS = "llvm-native llvm python3-numpy-native"

PYPI_PACKAGE = "numba"

PYPI_SEMVER_SUFFIX = ""
PYPI_ARCHIVE_NAME = "${PYPI_PACKAGE}-${PV}${PYPI_SEMVER_SUFFIX}.${PYPI_PACKAGE_EXT}"
PR = "${@ 'r1' if d.getVar('PYPI_SEMVER_SUFFIX') == '' else 'r0.'+d.getVar('PYPI_SEMVER_SUFFIX') }"

S:append = "${PYPI_SEMVER_SUFFIX}"

inherit pypi cmake setuptools3

SRC_URI[sha256sum] = "5df6158e5584eece5fc83294b949fd30b9f1125df7708862205217e068aabf16"

SRC_URI += "file://reduce-numpy-build-requirements.patch"

export NUMBA_DISABLE_TBB = "1"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-llvmlite \
"
