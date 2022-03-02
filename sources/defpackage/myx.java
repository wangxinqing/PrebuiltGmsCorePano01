package defpackage;

import android.app.Activity;
import android.content.Context;
import android.nfc.NfcAdapter;
import android.os.Bundle;

/* renamed from: myx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class myx {
    protected final NfcAdapter a;

    public myx(NfcAdapter nfcAdapter) {
        this.a = nfcAdapter;
    }

    public static myx a(Context context) {
        if (NfcAdapter.getDefaultAdapter(context) != null) {
            return new myx(NfcAdapter.getDefaultAdapter(context));
        }
        return null;
    }

    public final void a(Activity activity) {
        this.a.disableReaderMode(activity);
    }

    public final void a(Activity activity, NfcAdapter.ReaderCallback readerCallback, int i) {
        this.a.enableReaderMode(activity, readerCallback, i, (Bundle) null);
    }
}
