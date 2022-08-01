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

# MCVEVK
SRC_URI_append_mcvevk = " \
	file://0002-socfpga-mcvevk-clean-up-model-names-in-device-tree-f.patch \
	file://0003-mcvevk-add-env-commands-to-permit-booting-Linux-with.patch \
	file://0004-Revert-ARM-socfpga-Remove-socfpga_sdram_apply_static.patch \
	file://0005-configs-socfpga-enable-preboot-command-for-the-mcvev.patch \
	file://0006-ARM-socfpga-gen5-release-reset-before-using-USB-as-d.patch \
	file://0007-ARM-socfpga-gen5-release-reset-before-using-USB-as-h.patch \
	"
