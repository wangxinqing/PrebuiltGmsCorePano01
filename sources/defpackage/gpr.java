package defpackage;

import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.RemoteException;

/* renamed from: gpr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gpr implements NfcAdapter.ReaderCallback {
    final /* synthetic */ myw a;

    public gpr(myw myw) {
        this.a = myw;
    }

    public final void onTagDiscovered(Tag tag) {
        try {
            this.a.a(tag);
        } catch (RemoteException e) {
            gqa.d.e("ReaderCallback onTagDiscovered error", e, new Object[0]);
        }
    }
}
