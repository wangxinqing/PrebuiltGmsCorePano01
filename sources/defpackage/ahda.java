package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: ahda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahda implements aoqb {
    private final ahde a;

    public ahda(ahde ahde) {
        this.a = ahde;
    }

    public final aorr a(Object obj) {
        ahde ahde = this.a;
        Intent intent = new Intent();
        intent.setAction("com.google.android.libraries.storage.protostore.SIGNAL_ACTION");
        intent.setData((Uri) obj);
        intent.setPackage(ahde.c);
        intent.setFlags(268435456);
        ahdd ahdd = new ahdd();
        ahde.b.sendOrderedBroadcast(intent, (String) null, ahdd, ahde.e, -1, (String) null, (Bundle) null);
        return aorl.a(ahdd.a, 10, ahde.a, ahde.f);
    }
}
