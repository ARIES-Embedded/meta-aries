FILESEXTRAPATHS_prepend := "${THISDIR}/config:${THISDIR}/linux-yocto-4.4:"

SRC_URI_append = " file://aries;type=kmeta;destsuffix=aries "
KERNEL_FEATURES_append_m28evk = " bsp/m28evk/m28evk.scc "
KERNEL_FEATURES_append_m53evk = " bsp/m53evk/m53evk.scc "
KERNEL_FEATURES_append_mcvevk = " bsp/mcvevk/mcvevk.scc "
KERNEL_FEATURES_append_ma5d4evk = " bsp/ma5d4evk/ma5d4evk.scc "

COMPATIBLE_MACHINE_m28evk = "m28evk"
COMPATIBLE_MACHINE_m53evk = "m53evk"
COMPATIBLE_MACHINE_mcvevk = "mcvevk"
COMPATIBLE_MACHINE_ma5d4evk = "ma5d4evk"

SRC_URI_append_mcvevk = " \
	file://0001-dt-bindings-gpio-altera-Fix-altr-interrupt-type-prop.patch \
	file://0002-ARM-socfpga-dts-Enable-MMC-support-at-correct-place-.patch \
	file://0003-ARM-dts-socfpga-Fix-the-ethernet-clock-phandle.patch \
	file://0004-usb-dwc2-gadget-Repair-DSTS-register-decoding.patch \
	file://0005-fpga-add-usage-documentation-for-fpga-area.patch \
	file://0006-fpga-add-bindings-document-for-fpga-area.patch \
	file://0007-add-sysfs-document-for-fpga-bridge-class.patch \
	file://0008-ARM-socfpga-add-bindings-document-for-fpga-bridge-dr.patch \
	file://0009-fpga-add-fpga-bridge-framework.patch \
	file://0010-fpga-fpga-area-support-device-tree-control-for-FPGA-.patch \
	file://0011-ARM-socfpga-fpga-bridge-driver-support.patch \
	file://0012-ARM-dts-Compile-the-DTS-with-symbols-enabled.patch \
	file://0013-scripts-dtc-Update-to-version-with-overlays.patch \
	file://0014-configfs-Implement-binary-attributes-v5.patch \
	file://0015-OF-DT-Overlay-configfs-interface-v6.patch \
	file://0016-Documentation-dt-add-Altera-L3-NIC-bindings.patch \
	file://0017-ARM-socfpga-Add-driver-for-the-L3-interconnect.patch \
	file://0018-ARM-socfpga-dts-Add-l3nic-node.patch \
	file://0019-ARM-socfpga-dts-Make-L3-regs-also-syscon.patch \
	file://0020-ARM-socfpga-dts-Add-altera-specific-compatible-to-sd.patch \
	file://0021-fpga-fpga-bridge-Fix-the-l3-regs-compat-name.patch \
	file://0022-spi-Mark-instantiated-device-nodes-with-OF_POPULATE.patch \
	file://0023-configfs-Remove-ppos-increment-in-configfs_write_bin.patch \
	file://0024-fpga-altera-hps2fpga-fix-HPS2FPGA-bridge-visibility-.patch \
	file://0025-ARM-socfpga-Add-support-for-DENX-MCV-SoM-and-MCVEVK-.patch \
	file://9999-2G.patch \
	"

SRC_URI_append_ma5d4evk = " \
	file://0026-drm-panel-Add-support-for-Ampire-AM-800480R2-800x480.patch \
	file://0027-ARM-at91-dt-sama5d4-Add-pinmux-for-8-bit-MMC0-bus.patch \
	file://0028-ARM-at91-dt-sama5d4-Add-support-for-DENX-MA5D4-SoM-a.patch \
	file://0029-ARM-at91-dt-sama5d4-Adjust-DTS-for-released-board-ve.patch \
	"
