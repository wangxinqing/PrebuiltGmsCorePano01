package defpackage;

/* renamed from: nax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum nax {
    MULTI_TRANSPORT("multiple_transports"),
    NFC("nfc_instructions"),
    NFC_ENABLE("nfc_enable"),
    BLE("ble_instructions"),
    BLE_ENABLE("ble_enable"),
    BLE_PAIR("ble_pair_device"),
    BLE_PROCESS_REQUEST("ble_processing"),
    BLE_SELECT("ble_select_device"),
    USB("usb_instructions"),
    INTERNAL_TRANSPORT_USER_SELECTED("internal_transport_user_selected"),
    INTERNAL_TRANSPORT_CHALLENGE("internal_transport_challenge"),
    INTERNAL_TRANSPORT_CHALLENGE_COMPLETED("internal_transport_challenge_completed"),
    REQUEST_VALIDATION("request_validation");
    
    public final String n;

    private nax(String str) {
        this.n = str;
    }

    public final String toString() {
        return this.n;
    }
}
