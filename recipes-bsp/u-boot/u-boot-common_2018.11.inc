HOMEPAGE = "http://www.denx.de/wiki/U-Boot/WebHome"
SECTION = "bootloaders"
DEPENDS += "flex-native bison-native"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=30503fd321432fc713238f582193b78e"
PE = "1"

# We use the revision in order to avoid having to fetch it from the
# repo during parse
SRCREV = "0157013f4a4945bbdb70bb4d98d680e0845fd784"


SRC_URI = "git://git.denx.de/u-boot.git;protocol=https;branch=master \
	   file://0001-Revert-board-aries-Remove.patch \
	   file://0002-board-aries-add-MAINTAINERS-file-for-the-Aries-files.patch \
	  "


S = "${WORKDIR}/git"
