package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: apqf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apqf implements jbl {
    private static final iwd a = new iwd("FirebaseAuth", "PhoneNumberAuthPostProcessor");

    public final void a() {
    }

    public final void b() {
        a.d("postProcess starts", new Object[0]);
        appg.a(TimeUnit.SECONDS.toMillis(120));
        a.d("postProcess ends", new Object[0]);
    }
}
