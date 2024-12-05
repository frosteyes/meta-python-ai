DESCRIPTION = "pytest-metadata is a plugin that allowed for accessing pytest metadata"
DEPENDS += "python3-hatch-vcs-native"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5d425c8f3157dbf212db2ec53d9e5132"

PYPI_PACKAGE = "pytest_metadata"
SRC_URI[sha256sum] = "d2a29b0355fbc03f168aa96d41ff88b1a3b44a3b02acbe491801c98a048017c8"

inherit pypi python_hatchling

RDEPENDS:${PN} = " \
    python3-pytest \
"

BBCLASSEXTEND = "native nativesdk"
