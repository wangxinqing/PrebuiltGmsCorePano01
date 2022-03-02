package defpackage;

import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.Tag;

/* renamed from: uhg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uhg implements NfcAdapter.ReaderCallback {
    private final uhi a;

    public uhg(uhi uhi) {
        this.a = uhi;
    }

    public final void onTagDiscovered(Tag tag) {
        uhi uhi = this.a;
        Intent intent = new Intent("android.nfc.action.TAG_DISCOVERED");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("android.nfc.extra.TAG", tag);
        uhi.a.sendBroadcast(intent);
    }
}
