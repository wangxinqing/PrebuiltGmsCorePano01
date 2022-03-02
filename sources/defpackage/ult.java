package defpackage;

import android.content.Context;
import android.nfc.NfcAdapter;

/* renamed from: ult  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ult {
    private final NfcAdapter a;

    public ult(Context context) {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context.getApplicationContext());
        this.a = defaultAdapter;
        if (defaultAdapter == null) {
            ((anih) ((anih) ulh.a.b()).a("ult", "<init>", 32, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to retrieve default NfcAdapter, NFC is unsupported.");
        }
    }

    public final synchronized boolean a() {
        NfcAdapter nfcAdapter;
        nfcAdapter = this.a;
        return nfcAdapter != null && nfcAdapter.isEnabled();
    }
}
