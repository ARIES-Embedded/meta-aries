FILESEXTRAPATHS:prepend := "${THISDIR}/config:${THISDIR}/linux-yocto-5.15:"

SRC_URI:append = " file://aries;type=kmeta;destsuffix=aries "
KERNEL_FEATURES:append:m28evk = " bsp/m28evk/m28evk.scc "
KERNEL_FEATURES:append:m53evk = " bsp/m53evk/m53evk.scc "
KERNEL_FEATURES:append:ma5d4evk = " bsp/ma5d4evk/ma5d4evk.scc "

COMPATIBLE_MACHINE:m28evk = "m28evk"
COMPATIBLE_MACHINE:m53evk = "m53evk"
COMPATIBLE_MACHINE:ma5d4evk = "ma5d4evk"

KERNEL_VERSION_SANITY_SKIP="1"

SRC_URI:append:ma5d4evk = " \
	file://0001-drm-panel-Add-support-for-Ampire-AM-800480R2-800x480.patch \
	file://0002-ARM-at91-dt-sama5d4-Adjust-DTS-for-released-board-ve.patch \
	file://0003-ARM-at91-dt-sama5d4-Add-support-for-DENX-MA5D4-SoM-a.patch \
	file://0004-ARM-at91-dt-sama5d4-fix-duplicate-usb-labels-in-the-.patch \
	file://0005-ARM-at91-dt-ma5d4evk-clean-up-model-names-in-device-.patch \
	file://0006-ARM-at91-dt-ma5d4evk-fix-GPIO-used-for-SD-card-detec.patch \
	"

SRC_URI:append:m53evk = " \
	file://0001-drm-panel-Add-support-for-Ampire-AM-800480R2-800x480.patch \
	"

SRC_URI:append:m28evk = " \
	file://0001-drm-panel-Add-support-for-Ampire-AM-800480R2-800x480.patch \
	file://0007-ARM-dts-imx28-m28-cleanup-model-and-compatibility-na.patch \
	file://0008-ARM-dts-imx28-m28evk-Convert-to-the-new-display-bind.patch \
	file://0009-mfd-mxs-lradc-start-interrupt-numbering-with-one-as-.patch \
	file://0010-media-i2c-ov2640-needs-config-V4L2_FWNODE-selected.patch \
	file://0011-drm-panel-increase-clock-freq-of-Ampire-AM-800480R2-.patch \
	"
