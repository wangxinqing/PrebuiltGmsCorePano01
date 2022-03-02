package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.io.File;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;

/* renamed from: aljx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aljx implements Callable {
    private final aljy a;
    private final byte[] b;

    public aljx(aljy aljy, byte[] bArr) {
        this.a = aljy;
        this.b = bArr;
    }

    public final Object call() {
        CompletableFuture completableFuture;
        aljy aljy = this.a;
        byte[] bArr = this.b;
        Context context = aljy.d;
        alke.a();
        if (alkc.a(context)) {
            completableFuture = CompletableFuture.completedFuture((Object) null);
        } else {
            CompletableFuture completableFuture2 = new CompletableFuture();
            alkb alkb = new alkb(context, completableFuture2);
            context.registerReceiver(alkb, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            completableFuture = completableFuture2.whenComplete(new alka(context, alkb));
        }
        completableFuture.get();
        File file = aljy.b;
        if (file == null) {
            file = aljy.c;
        }
        aljy.a(file);
        aljt.a(new File(file, String.format(Locale.US, "event_%s.protobuf", new Object[]{UUID.randomUUID()})), bArr);
        return null;
    }
}
