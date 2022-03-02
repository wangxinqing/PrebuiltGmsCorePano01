package defpackage;

import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.drive.auth.AppIdentity;
import java.io.IOException;

/* renamed from: keg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class keg implements IBinder.DeathRecipient {
    final int a;
    final ParcelFileDescriptor b;
    final String c;
    final kie d;
    final knc e;
    final AppIdentity f;
    final IBinder g;
    final /* synthetic */ keh h;

    public keg(keh keh, ParcelFileDescriptor parcelFileDescriptor, kie kie, knc knc, AppIdentity appIdentity, IBinder iBinder, String str) {
        this.h = keh;
        this.d = kie;
        this.e = knc;
        iva.a((Object) parcelFileDescriptor);
        this.b = parcelFileDescriptor;
        this.a = keh.b.getAndIncrement();
        iva.a((Object) appIdentity);
        this.f = appIdentity;
        iva.a((Object) iBinder);
        this.g = iBinder;
        System.currentTimeMillis();
        this.c = str;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        try {
            this.b.close();
        } catch (IOException e2) {
            keh.a.b("Unable to close file: %d", Integer.valueOf(this.a));
        }
        kie kie = this.d;
        if (kie != null) {
            kie.c();
        }
        this.g.unlinkToDeath(this, 0);
    }

    public final void binderDied() {
        keh.a.a("Client died with open content: %d.", Integer.valueOf(this.a));
        this.h.a(this);
        a();
    }
}
