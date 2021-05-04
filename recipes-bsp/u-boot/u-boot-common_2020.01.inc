HOMEPAGE = "http://www.denx.de/wiki/U-Boot/WebHome"
SECTION = "bootloaders"
DEPENDS += "flex-native bison-native"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=30503fd321432fc713238f582193b78e"
PE = "1"

# We use the revision in order to avoid having to fetch it from the
# repo during parse
SRCREV = "0b0c6af38738f2c132cfd41a240889acaa031c8f"

SRC_URI = "git://git.denx.de/u-boot.git \
	  "

S = "${WORKDIR}/git"

FILESEXTRAPATHS_prepend := "${THISDIR}/u-boot-2020.01:"

# M28EVK
SRC_URI_append_m28evk = " \
	file://0001-arm-mxs-Re-add-support-for-Aries-M28-SoM-and-M28EVK-.patch \
	"

# M53EVK
SRC_URI_append_m53evk = " \
	file://0002-arm-mxs-Re-add-support-for-Aries-M53-SoM-on-the-M53E.patch \
	"

# MA5D4EVK
SRC_URI_append_ma5d4evk = " \
	file://0003-arm-atmel-Re-add-support-for-the-Aries-MA5D4-SoM-on-.patch \
	"

# MCVEVK
SRC_URI_append_mcvevk = " \
	file://0004-socfpga-mcvevk-clean-up-model-names-in-device-tree-f.patch \
	file://0005-mcvevk-add-env-commands-to-permit-booting-Linux-with.patch \
	file://0006-Revert-ARM-socfpga-Remove-socfpga_sdram_apply_static.patch \
	"

# MAXEVK
SRC_URI_append_maxevk = " \
	file://0007-arm-socfpga-Add-support-for-Aries-MAX-SoM-on-the-MAX.patch \
	"
