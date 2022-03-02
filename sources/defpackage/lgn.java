package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.drive.auth.CallingAppInfo;
import com.google.android.libraries.rocket.impressions.Session;

/* renamed from: lgn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lgn extends lgl implements lfs {
    public boolean c;
    private final String d;
    private final CallingAppInfo e;

    public final void a(lgc lgc) {
        iva.a(!this.c, (Object) "Can't send log event when paused");
        super.a(lgc);
    }

    public final /* bridge */ /* synthetic */ lfq c() {
        throw null;
    }

    public final lgc d() {
        iva.a(!this.c, (Object) "Can't create log event when paused");
        lgc d2 = super.d();
        d2.a(this.d);
        d2.a(this.e);
        return d2;
    }

    public final Bundle e() {
        Session session;
        iva.a(!this.c, (Object) "Can't pause an already paused session");
        this.c = true;
        Bundle bundle = new Bundle();
        agyg agyg = this.a;
        synchronized (agyg.a) {
            agyg.a(agyj.IN_PROGRESS, "pauseSession");
            agyl agyl = agyg.d;
            Session session2 = agyg.c;
            agyg.a(agyf.a(agyl, session2.g, session2.h));
            agyg.c.c = agyj.PAUSED;
            agyg.b.b();
            session = agyg.c;
        }
        bundle.putParcelable("impression-session", session);
        bundle.putString("account-name", this.d);
        bundle.putParcelable("app-info", this.e);
        return bundle;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public lgn(android.os.Bundle r8, defpackage.lgm r9, android.content.Context r10) {
        /*
            r7 = this;
            java.lang.String r0 = "account-name"
            java.lang.String r0 = r8.getString(r0)
            java.lang.String r1 = "impression-session"
            android.os.Parcelable r1 = r8.getParcelable(r1)
            agyh r2 = new agyh
            r2.<init>()
            agym r9 = r9.a(r0)
            com.google.android.libraries.rocket.impressions.Session r1 = (com.google.android.libraries.rocket.impressions.Session) r1
            agyg r0 = new agyg
            agyl r2 = r2.a
            r0.<init>(r2, r9, r1)
            java.lang.Object r9 = r0.a
            monitor-enter(r9)
            agyj r1 = defpackage.agyj.PAUSED     // Catch:{ all -> 0x006f }
            java.lang.String r2 = "resumeSession"
            r0.a(r1, r2)     // Catch:{ all -> 0x006f }
            agym r1 = r0.b     // Catch:{ all -> 0x006f }
            boolean r1 = r1.c()     // Catch:{ all -> 0x006f }
            if (r1 != 0) goto L_0x0067
            boolean r1 = r0.b()     // Catch:{ all -> 0x006f }
            if (r1 != 0) goto L_0x004d
            agyl r1 = r0.d     // Catch:{ all -> 0x006f }
            com.google.android.libraries.rocket.impressions.Session r2 = r0.c     // Catch:{ all -> 0x006f }
            long r3 = r2.g     // Catch:{ all -> 0x006f }
            long r5 = r2.h     // Catch:{ all -> 0x006f }
            agyf r1 = defpackage.agyf.a(r1, r3, r5)     // Catch:{ all -> 0x006f }
            r0.a(r1)     // Catch:{ all -> 0x006f }
            com.google.android.libraries.rocket.impressions.Session r1 = r0.c     // Catch:{ all -> 0x006f }
            agyj r2 = defpackage.agyj.IN_PROGRESS     // Catch:{ all -> 0x006f }
            r1.c = r2     // Catch:{ all -> 0x006f }
            monitor-exit(r9)     // Catch:{ all -> 0x006f }
            goto L_0x004e
        L_0x004d:
            monitor-exit(r9)     // Catch:{ all -> 0x006f }
        L_0x004e:
            r7.<init>(r0, r10)
            java.lang.String r9 = "app-info"
            android.os.Parcelable r9 = r8.getParcelable(r9)
            com.google.android.gms.drive.auth.CallingAppInfo r9 = (com.google.android.gms.drive.auth.CallingAppInfo) r9
            r7.e = r9
            java.lang.String r9 = "account-name"
            java.lang.String r8 = r8.getString(r9)
            r7.d = r8
            r8 = 0
            r7.c = r8
            return
        L_0x0067:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006f }
            java.lang.String r10 = "Cannot resume a paused session instance; recreate a new ImpressionLogger instance and call resumeSession() on that instead"
            r8.<init>(r10)     // Catch:{ all -> 0x006f }
            throw r8     // Catch:{ all -> 0x006f }
        L_0x006f:
            r8 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x006f }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgn.<init>(android.os.Bundle, lgm, android.content.Context):void");
    }

    public lgn(CallingAppInfo callingAppInfo, String str, lgm lgm, Context context) {
        super(new agyh().a(lgm.a(str), lge.a(16)), context);
        iva.a((Object) callingAppInfo);
        this.e = callingAppInfo;
        iva.a((Object) str);
        this.d = str;
        this.c = false;
    }
}
