package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.support.v4.graphics.drawable.IconCompat;
import androidx.slice.Slice;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: mtp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class mtp {
    public static mtp a(Context context, Uri uri) {
        aoo aoo;
        try {
            aoo = new aoo(context, uri);
        } catch (IllegalStateException e) {
            ((anih) ((anih) mte.a.c()).a("mtp", "a", 55, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ListSliceBuilderWrapper: Meet exception when constructing ListBuilder!");
            aoo = null;
        }
        if (aoo != null) {
            return new mtm(aoo);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return new mto(context, uri);
        }
        ((anih) ((anih) mte.a.c()).a("mtp", "a", 64, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ListSliceBuilderWrapper: Build androidx Slice fail and os version is %d", Build.VERSION.SDK_INT);
        return new mtn();
    }

    public abstract Slice a();

    /* access modifiers changed from: protected */
    public abstract void a(int i);

    public abstract void a(PendingIntent pendingIntent, IconCompat iconCompat, String str, String str2, boolean z);

    /* access modifiers changed from: package-private */
    public final boolean a(aoe aoe, Uri uri, amqy amqy) {
        PendingIntent pendingIntent;
        AtomicReference atomicReference = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        mtv mtv = new mtv(atomicReference, countDownLatch, aoe, uri);
        aoe.a(uri, mtv);
        try {
            mtv.a(aoe.c(uri));
            countDownLatch.await(aymt.a.a().aW(), TimeUnit.MILLISECONDS);
        } catch (IllegalArgumentException | InterruptedException e) {
            anih anih = (anih) mte.a.c();
            anih.a(e);
            ((anih) anih.a("mty", "a", 65, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Error waiting for slice binding for uri %s", (Object) uri.toString());
            aoe.b(uri, mtv);
        }
        ArrayList a = mty.a((Slice) atomicReference.get());
        if (a.isEmpty()) {
            return false;
        }
        int size = a.size();
        for (int i = 0; i < size; i++) {
            mtx mtx = (mtx) a.get(i);
            if (!aymw.a.a().ak()) {
                pendingIntent = mtx.d();
            } else {
                pendingIntent = (PendingIntent) amqy.a(mtx.d());
            }
            a(pendingIntent, mtx.c(), mtx.a(), mtx.b(), true);
        }
        return true;
    }
}
