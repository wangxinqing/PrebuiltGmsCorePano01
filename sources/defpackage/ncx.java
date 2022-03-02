package defpackage;

/* renamed from: ncx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum ncx {
    MULTI_TRANSPORT("multiple_transports"),
    NFC("nfc_instructions"),
    NFC_ENABLE("nfc_enable"),
    BLE("ble_instructions"),
    BLE_ENABLE("ble_enable"),
    BLE_PAIR("ble_pair_device"),
    BLE_PROCESS_REQUEST("ble_processing"),
    BLE_SELECT("ble_select_device"),
    USB("usb_instructions"),
    ESK("esk_instructions");
    
    public final String k;

    private ncx(String str) {
        this.k = str;
    }

    public final String toString() {
        return this.k;
    }
}
