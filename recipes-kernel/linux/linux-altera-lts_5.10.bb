LINUX_VERSION = "5.10.120"
LINUX_VERSION_SUFFIX = "-lts"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

SRCREV = "e590fa8167f46629132bc0cc5576da7b9c0bc9c4"

include linux-altera.inc

FILESEXTRAPATHS:prepend := "${THISDIR}/config::${THISDIR}/linux-altera-lts-5.10:"

SRC_URI:append:mcvevk = " \
	file://lbdaf.scc \
	file://0001-socfpga-mcvevk-clean-up-model-names-in-device-tree-f.patch \
	file://0002-socfpga-mcvevk-framebuffer-support-for-the-Altera-VI.patch \
	"

SRC_URI:append:maxevk = " \
	file://lbdaf.scc \
	file://0003-ARM-dts-socfpga-Add-support-for-the-Aries-MAX-SoM-on.patch \
	file://0004-usb-dwc2-add-device-tree-property-to-use-an-external.patch \
	"
