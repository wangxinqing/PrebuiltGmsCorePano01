package defpackage;

import java.util.concurrent.Callable;
import javax.crypto.Mac;

/* renamed from: plb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class plb implements Callable {
    final /* synthetic */ String a;

    public plb(String str) {
        this.a = str;
    }

    /* renamed from: a */
    public final Mac call() {
        return Mac.getInstance(this.a);
    }
}
