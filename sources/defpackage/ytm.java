package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.plus.internal.model.apps.ApplicationEntity;
import com.google.android.gms.plus.model.posts.Comment;
import com.google.android.gms.plus.model.posts.Post;
import com.google.android.gms.plus.service.DefaultChimeraIntentService;
import com.google.android.gms.plus.service.PlusChimeraService;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;
import java.util.List;

/* renamed from: ytm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ytm extends bhw implements ytn {
    public final Context a;
    private final ClientContext b;
    private final String[] c;
    private final ytt d;

    public ytm() {
        super("com.google.android.gms.plus.internal.IPlusInternalService");
    }

    public final void a(String str, String str2) {
        PlusChimeraService.a();
        DefaultChimeraIntentService.a(this.a, new zci(str, str2));
    }

    public final String b() {
        return this.d.a();
    }

    public final void c(ytk ytk, Post post) {
        PlusChimeraService.a();
        DefaultChimeraIntentService.a(this.a, new zbx(this.b, ytk, post));
    }

    public final void d(ytk ytk, String str) {
        PlusChimeraService.a();
        DefaultChimeraIntentService.a(this.a, new zcc(str, ytk));
    }

    public final void e(ytk ytk, String str) {
        PlusChimeraService.a();
        iva.a((Object) ytk);
        iva.b(!TextUtils.isEmpty(str), "The momentId parameter is required.");
        DefaultChimeraIntentService.a(this.a, new zca(this.b, str, ytk));
    }

    public final void f(ytk ytk, String str) {
        PlusChimeraService.a();
        iva.a((Object) ytk);
        iva.b(!TextUtils.isEmpty(str), "The momentId parameter is required.");
        DefaultChimeraIntentService.a(this.a, new zbv(this.b, str, ytk));
    }

    public final void b(ytk ytk, int i, int i2, String str) {
        PlusChimeraService.a();
        iva.a((Object) ytk);
        DefaultChimeraIntentService.a(this.a, new zbp(this.b, i, i2, str, ytk));
    }

    public ytm(Context context, ClientContext clientContext, ClientContext clientContext2) {
        super("com.google.android.gms.plus.internal.IPlusInternalService");
        this.a = context;
        this.b = clientContext2;
        this.c = clientContext2 != null ? clientContext2.h() : null;
        this.d = new ytt(context, clientContext, clientContext2);
    }

    public final void a(ytk ytk) {
        this.d.a(new zar(ytk));
    }

    public final void c(ytk ytk, String str) {
        PlusChimeraService.a();
        DefaultChimeraIntentService.a(this.a, new zbu(this.b, str, ytk));
    }

    public final void a(ytk ytk, int i, int i2, String str) {
        DefaultChimeraIntentService.a(this.a, new zbz(this.b, (String) PlusChimeraService.a.get(i), i2, str, ytk));
    }

    public final void b(ytk ytk, Post post) {
        PlusChimeraService.a();
        DefaultChimeraIntentService.a(this.a, new zby(this.b, ytk, post));
    }

    public final void a(ytk ytk, int i, String str) {
        DefaultChimeraIntentService.a(this.a, new zbs(this.b, ytk));
    }

    public final void a(ytk ytk, Uri uri, Bundle bundle) {
        this.d.a((yth) new zar(ytk), uri, bundle);
    }

    public final void b(ytk ytk, String str) {
        this.d.b(new zar(ytk), str);
    }

    public final void a(ytk ytk, Comment comment) {
        PlusChimeraService.a();
        DefaultChimeraIntentService.a(this.a, new zbk(this.b, ytk, comment));
    }

    public final void a(ytk ytk, Post post) {
        PlusChimeraService.a();
        DefaultChimeraIntentService.a(this.a, new zbj(this.b, ytk, post));
    }

    public final void a(ytk ytk, String str) {
        this.d.a((yth) new zar(ytk), str);
    }

    public final void a(ytk ytk, String str, int i, String str2) {
        PlusChimeraService.a();
        iva.a((Object) ytk);
        iva.b(!TextUtils.isEmpty(str), "The appId parameter is required.");
        DefaultChimeraIntentService.a(this.a, new zbm(this.b, str, i, str2, ytk));
    }

    public final void a(ytk ytk, String str, int i, String str2, Uri uri, String str3) {
        PlusChimeraService.a();
        DefaultChimeraIntentService.a(this.a, new zbn(this.b, i, str2, uri, str3, "me", str, ytk));
    }

    public final void a(ytk ytk, String str, Audience audience) {
        DefaultChimeraIntentService.a(this.a, new zcf(this.b, str, audience, ytk));
    }

    public final void a(ytk ytk, String str, ApplicationEntity applicationEntity) {
        DefaultChimeraIntentService.a(this.a, new zbc(this.b, str, ytk, applicationEntity));
    }

    public final void a(ytk ytk, String str, ApplicationEntity applicationEntity, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        DefaultChimeraIntentService.a(this.a, new zce(this.b, str, applicationEntity, list, z, z2, z3, z4, ytk));
    }

    public final void a(ytk ytk, String str, UpgradeAccountEntity upgradeAccountEntity) {
        DefaultChimeraIntentService.a(this.a, new zcj(this.b, str, upgradeAccountEntity, ytk));
    }

    public final void a(ytk ytk, String str, String str2) {
        this.d.a((yth) new zar(ytk), str, str2);
    }

    public final void a(ytk ytk, String str, String str2, int i, String str3) {
        PlusChimeraService.a();
        DefaultChimeraIntentService.a(this.a, new zbe(str, str2, i, str3, ytk, this.c, zav.a));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002f, code lost:
        if (defpackage.jca.a().a(r7.a, new android.content.Intent("com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState").setClassName(r12, "com.google.android.gms.auth.api.signin.RevocationBoundService"), new defpackage.zat(r7, "plus"), 1) == false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.ytk r8, java.lang.String r9, java.lang.String r10, boolean r11, java.lang.String r12) {
        /*
            r7 = this;
            if (r12 == 0) goto L_0x0044
            com.google.android.gms.common.internal.ClientContext r0 = new com.google.android.gms.common.internal.ClientContext
            com.google.android.gms.common.internal.ClientContext r1 = r7.b
            r0.<init>(r1)
            r0.f = r12
            android.content.Context r1 = r7.a
            r0.b((android.content.Context) r1)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState"
            r0.<init>(r1)
            java.lang.String r1 = "com.google.android.gms.auth.api.signin.RevocationBoundService"
            android.content.Intent r0 = r0.setClassName(r12, r1)
            zat r1 = new zat
            java.lang.String r2 = "plus"
            r1.<init>(r7, r2)
            jca r2 = defpackage.jca.a()     // Catch:{ SecurityException -> 0x0032 }
            android.content.Context r3 = r7.a     // Catch:{ SecurityException -> 0x0032 }
            r4 = 1
            boolean r0 = r2.a(r3, r0, r1, r4)     // Catch:{ SecurityException -> 0x0032 }
            if (r0 != 0) goto L_0x0044
            goto L_0x003a
        L_0x0032:
            r0 = move-exception
            java.lang.String r1 = "PlusService"
            java.lang.String r2 = "Unexpected exception starting RevocationBoundService service"
            android.util.Log.e(r1, r2, r0)
        L_0x003a:
            android.content.Context r0 = r7.a
            zaz r1 = new zaz
            r1.<init>(r12)
            com.google.android.gms.plus.service.DefaultChimeraIntentService.a(r0, r1)
        L_0x0044:
            android.content.Context r12 = r7.a
            zbb r6 = new zbb
            com.google.android.gms.common.internal.ClientContext r1 = r7.b
            r0 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.gms.plus.service.DefaultChimeraIntentService.a(r12, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ytm.a(ytk, java.lang.String, java.lang.String, boolean, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r12v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x030b  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r11, android.os.Parcel r12, android.os.Parcel r13) {
        /*
            r10 = this;
            r0 = 0
            java.lang.String r1 = "com.google.android.gms.plus.internal.IPlusInternalCallbacks"
            switch(r11) {
                case 1: goto L_0x0503;
                case 2: goto L_0x04dc;
                case 3: goto L_0x04b9;
                case 4: goto L_0x04ad;
                case 5: goto L_0x0489;
                case 6: goto L_0x0468;
                case 7: goto L_0x0438;
                case 8: goto L_0x0414;
                case 9: goto L_0x0404;
                case 10: goto L_0x03d1;
                case 11: goto L_0x03a9;
                case 12: goto L_0x0385;
                case 13: goto L_0x0354;
                case 14: goto L_0x0328;
                case 15: goto L_0x02e3;
                case 16: goto L_0x02b2;
                case 17: goto L_0x0281;
                case 18: goto L_0x0255;
                case 19: goto L_0x020f;
                case 20: goto L_0x01e7;
                case 21: goto L_0x01bf;
                case 22: goto L_0x0197;
                case 23: goto L_0x016f;
                case 24: goto L_0x0133;
                case 25: goto L_0x010f;
                case 26: goto L_0x00eb;
                case 27: goto L_0x00bf;
                case 28: goto L_0x008c;
                case 29: goto L_0x0060;
                case 30: goto L_0x0034;
                case 31: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r11 = 0
            return r11
        L_0x0008:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x001f
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x0019
            ytk r0 = (defpackage.ytk) r0
            goto L_0x0020
        L_0x0019:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x0020
        L_0x001f:
        L_0x0020:
            int r11 = r12.readInt()
            int r1 = r12.readInt()
            java.lang.String r12 = r12.readString()
            r10.b(r0, r11, r1, r12)
            r13.writeNoException()
            goto L_0x0525
        L_0x0034:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x004b
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x0045
            ytk r0 = (defpackage.ytk) r0
            goto L_0x004c
        L_0x0045:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x004c
        L_0x004b:
        L_0x004c:
            java.lang.String r11 = r12.readString()
            android.os.Parcelable$Creator r1 = com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r12, (android.os.Parcelable.Creator) r1)
            com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity r12 = (com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity) r12
            r10.a((defpackage.ytk) r0, (java.lang.String) r11, (com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity) r12)
            r13.writeNoException()
            goto L_0x0525
        L_0x0060:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x0077
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x0071
            ytk r0 = (defpackage.ytk) r0
            goto L_0x0078
        L_0x0071:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x0078
        L_0x0077:
        L_0x0078:
            int r11 = r12.readInt()
            int r1 = r12.readInt()
            java.lang.String r12 = r12.readString()
            r10.a((defpackage.ytk) r0, (int) r11, (int) r1, (java.lang.String) r12)
            r13.writeNoException()
            goto L_0x0525
        L_0x008c:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x00a4
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x009e
            ytk r0 = (defpackage.ytk) r0
            r2 = r0
            goto L_0x00a6
        L_0x009e:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x00a5
        L_0x00a4:
        L_0x00a5:
            r2 = r0
        L_0x00a6:
            java.lang.String r3 = r12.readString()
            java.lang.String r4 = r12.readString()
            boolean r5 = defpackage.bhx.a(r12)
            java.lang.String r6 = r12.readString()
            r1 = r10
            r1.a((defpackage.ytk) r2, (java.lang.String) r3, (java.lang.String) r4, (boolean) r5, (java.lang.String) r6)
            r13.writeNoException()
            goto L_0x0525
        L_0x00bf:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x00d6
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x00d0
            ytk r0 = (defpackage.ytk) r0
            goto L_0x00d7
        L_0x00d0:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x00d7
        L_0x00d6:
        L_0x00d7:
            java.lang.String r11 = r12.readString()
            int r1 = r12.readInt()
            java.lang.String r12 = r12.readString()
            r10.a((defpackage.ytk) r0, (java.lang.String) r11, (int) r1, (java.lang.String) r12)
            r13.writeNoException()
            goto L_0x0525
        L_0x00eb:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x0102
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x00fc
            ytk r0 = (defpackage.ytk) r0
            goto L_0x0103
        L_0x00fc:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x0103
        L_0x0102:
        L_0x0103:
            java.lang.String r11 = r12.readString()
            r10.f(r0, r11)
            r13.writeNoException()
            goto L_0x0525
        L_0x010f:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x0126
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x0120
            ytk r0 = (defpackage.ytk) r0
            goto L_0x0127
        L_0x0120:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x0127
        L_0x0126:
        L_0x0127:
            java.lang.String r11 = r12.readString()
            r10.e(r0, r11)
            r13.writeNoException()
            goto L_0x0525
        L_0x0133:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x014b
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x0145
            ytk r0 = (defpackage.ytk) r0
            r2 = r0
            goto L_0x014d
        L_0x0145:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x014c
        L_0x014b:
        L_0x014c:
            r2 = r0
        L_0x014d:
            java.lang.String r3 = r12.readString()
            int r4 = r12.readInt()
            java.lang.String r5 = r12.readString()
            android.os.Parcelable$Creator r11 = android.net.Uri.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r12, (android.os.Parcelable.Creator) r11)
            r6 = r11
            android.net.Uri r6 = (android.net.Uri) r6
            java.lang.String r7 = r12.readString()
            r1 = r10
            r1.a(r2, r3, r4, r5, r6, r7)
            r13.writeNoException()
            goto L_0x0525
        L_0x016f:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x0186
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x0180
            ytk r0 = (defpackage.ytk) r0
            goto L_0x0187
        L_0x0180:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x0187
        L_0x0186:
        L_0x0187:
            android.os.Parcelable$Creator r11 = com.google.android.gms.plus.model.posts.Post.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r12, (android.os.Parcelable.Creator) r11)
            com.google.android.gms.plus.model.posts.Post r11 = (com.google.android.gms.plus.model.posts.Post) r11
            r10.c((defpackage.ytk) r0, (com.google.android.gms.plus.model.posts.Post) r11)
            r13.writeNoException()
            goto L_0x0525
        L_0x0197:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x01ae
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x01a8
            ytk r0 = (defpackage.ytk) r0
            goto L_0x01af
        L_0x01a8:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x01af
        L_0x01ae:
        L_0x01af:
            android.os.Parcelable$Creator r11 = com.google.android.gms.plus.model.posts.Post.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r12, (android.os.Parcelable.Creator) r11)
            com.google.android.gms.plus.model.posts.Post r11 = (com.google.android.gms.plus.model.posts.Post) r11
            r10.b((defpackage.ytk) r0, (com.google.android.gms.plus.model.posts.Post) r11)
            r13.writeNoException()
            goto L_0x0525
        L_0x01bf:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x01d6
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x01d0
            ytk r0 = (defpackage.ytk) r0
            goto L_0x01d7
        L_0x01d0:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x01d7
        L_0x01d6:
        L_0x01d7:
            android.os.Parcelable$Creator r11 = com.google.android.gms.plus.model.posts.Post.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r12, (android.os.Parcelable.Creator) r11)
            com.google.android.gms.plus.model.posts.Post r11 = (com.google.android.gms.plus.model.posts.Post) r11
            r10.a((defpackage.ytk) r0, (com.google.android.gms.plus.model.posts.Post) r11)
            r13.writeNoException()
            goto L_0x0525
        L_0x01e7:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x01fe
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x01f8
            ytk r0 = (defpackage.ytk) r0
            goto L_0x01ff
        L_0x01f8:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x01ff
        L_0x01fe:
        L_0x01ff:
            android.os.Parcelable$Creator r11 = com.google.android.gms.plus.model.posts.Comment.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r12, (android.os.Parcelable.Creator) r11)
            com.google.android.gms.plus.model.posts.Comment r11 = (com.google.android.gms.plus.model.posts.Comment) r11
            r10.a((defpackage.ytk) r0, (com.google.android.gms.plus.model.posts.Comment) r11)
            r13.writeNoException()
            goto L_0x0525
        L_0x020f:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x0227
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x0221
            ytk r0 = (defpackage.ytk) r0
            r2 = r0
            goto L_0x0229
        L_0x0221:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x0228
        L_0x0227:
        L_0x0228:
            r2 = r0
        L_0x0229:
            java.lang.String r3 = r12.readString()
            android.os.Parcelable$Creator r11 = com.google.android.gms.plus.internal.model.apps.ApplicationEntity.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r12, (android.os.Parcelable.Creator) r11)
            r4 = r11
            com.google.android.gms.plus.internal.model.apps.ApplicationEntity r4 = (com.google.android.gms.plus.internal.model.apps.ApplicationEntity) r4
            android.os.Parcelable$Creator r11 = com.google.android.gms.common.people.data.AudienceMember.CREATOR
            java.util.ArrayList r5 = r12.createTypedArrayList(r11)
            boolean r6 = defpackage.bhx.a(r12)
            boolean r7 = defpackage.bhx.a(r12)
            boolean r8 = defpackage.bhx.a(r12)
            boolean r9 = defpackage.bhx.a(r12)
            r1 = r10
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9)
            r13.writeNoException()
            goto L_0x0525
        L_0x0255:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x026c
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x0266
            ytk r0 = (defpackage.ytk) r0
            goto L_0x026d
        L_0x0266:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x026d
        L_0x026c:
        L_0x026d:
            java.lang.String r11 = r12.readString()
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.people.data.Audience.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r12, (android.os.Parcelable.Creator) r1)
            com.google.android.gms.common.people.data.Audience r12 = (com.google.android.gms.common.people.data.Audience) r12
            r10.a((defpackage.ytk) r0, (java.lang.String) r11, (com.google.android.gms.common.people.data.Audience) r12)
            r13.writeNoException()
            goto L_0x0525
        L_0x0281:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x0298
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x0292
            ytk r0 = (defpackage.ytk) r0
            goto L_0x0299
        L_0x0292:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x0299
        L_0x0298:
        L_0x0299:
            android.os.Parcelable$Creator r11 = com.google.android.gms.plus.internal.model.acls.AclsRequest.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r12, (android.os.Parcelable.Creator) r11)
            com.google.android.gms.plus.internal.model.acls.AclsRequest r11 = (com.google.android.gms.plus.internal.model.acls.AclsRequest) r11
            android.content.Context r12 = r10.a
            zcg r1 = new zcg
            com.google.android.gms.common.internal.ClientContext r2 = r10.b
            r1.<init>(r2, r11, r0)
            com.google.android.gms.plus.service.DefaultChimeraIntentService.a(r12, r1)
            r13.writeNoException()
            goto L_0x0525
        L_0x02b2:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x02c9
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x02c3
            ytk r0 = (defpackage.ytk) r0
            goto L_0x02ca
        L_0x02c3:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x02ca
        L_0x02c9:
        L_0x02ca:
            android.os.Parcelable$Creator r11 = com.google.android.gms.plus.internal.model.acls.AclsRequest.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r12, (android.os.Parcelable.Creator) r11)
            com.google.android.gms.plus.internal.model.acls.AclsRequest r11 = (com.google.android.gms.plus.internal.model.acls.AclsRequest) r11
            android.content.Context r12 = r10.a
            zch r1 = new zch
            com.google.android.gms.common.internal.ClientContext r2 = r10.b
            r1.<init>(r2, r11, r0)
            com.google.android.gms.plus.service.DefaultChimeraIntentService.a(r12, r1)
            r13.writeNoException()
            goto L_0x0525
        L_0x02e3:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x02fb
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x02f5
            ytk r0 = (defpackage.ytk) r0
            r6 = r0
            goto L_0x02fd
        L_0x02f5:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x02fc
        L_0x02fb:
        L_0x02fc:
            r6 = r0
        L_0x02fd:
            java.lang.String r4 = r12.readString()
            boolean r5 = defpackage.bhx.a(r12)
            java.lang.String r11 = r12.readString()
            if (r11 == 0) goto L_0x0315
            android.content.Context r12 = r10.a
            zaz r0 = new zaz
            r0.<init>(r11)
            com.google.android.gms.plus.service.DefaultChimeraIntentService.a(r12, r0)
        L_0x0315:
            android.content.Context r11 = r10.a
            zbb r12 = new zbb
            com.google.android.gms.common.internal.ClientContext r2 = r10.b
            r3 = 0
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.android.gms.plus.service.DefaultChimeraIntentService.a(r11, r12)
            r13.writeNoException()
            goto L_0x0525
        L_0x0328:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x033f
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x0339
            ytk r0 = (defpackage.ytk) r0
            goto L_0x0340
        L_0x0339:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x0340
        L_0x033f:
        L_0x0340:
            java.lang.String r11 = r12.readString()
            android.os.Parcelable$Creator r1 = com.google.android.gms.plus.internal.model.apps.ApplicationEntity.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r12, (android.os.Parcelable.Creator) r1)
            com.google.android.gms.plus.internal.model.apps.ApplicationEntity r12 = (com.google.android.gms.plus.internal.model.apps.ApplicationEntity) r12
            r10.a((defpackage.ytk) r0, (java.lang.String) r11, (com.google.android.gms.plus.internal.model.apps.ApplicationEntity) r12)
            r13.writeNoException()
            goto L_0x0525
        L_0x0354:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x036b
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x0365
            ytk r0 = (defpackage.ytk) r0
            goto L_0x036c
        L_0x0365:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x036c
        L_0x036b:
        L_0x036c:
            android.os.Parcelable$Creator r11 = com.google.android.gms.plus.internal.model.acls.AclsRequest.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r12, (android.os.Parcelable.Creator) r11)
            com.google.android.gms.plus.internal.model.acls.AclsRequest r11 = (com.google.android.gms.plus.internal.model.acls.AclsRequest) r11
            android.content.Context r12 = r10.a
            zbd r1 = new zbd
            com.google.android.gms.common.internal.ClientContext r2 = r10.b
            r1.<init>(r2, r11, r0)
            com.google.android.gms.plus.service.DefaultChimeraIntentService.a(r12, r1)
            r13.writeNoException()
            goto L_0x0525
        L_0x0385:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x039b
            android.os.IInterface r13 = r11.queryLocalInterface(r1)
            boolean r0 = r13 instanceof defpackage.ytk
            if (r0 == 0) goto L_0x0396
            ytk r13 = (defpackage.ytk) r13
            goto L_0x039b
        L_0x0396:
            yti r13 = new yti
            r13.<init>(r11)
        L_0x039b:
            defpackage.bhx.a(r12)
            defpackage.bhx.a(r12)
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Not implemented."
            r11.<init>(r12)
            throw r11
        L_0x03a9:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x03c0
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x03ba
            ytk r0 = (defpackage.ytk) r0
            goto L_0x03c1
        L_0x03ba:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x03c1
        L_0x03c0:
        L_0x03c1:
            int r11 = r12.readInt()
            java.lang.String r12 = r12.readString()
            r10.a((defpackage.ytk) r0, (int) r11, (java.lang.String) r12)
            r13.writeNoException()
            goto L_0x0525
        L_0x03d1:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x03e9
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x03e3
            ytk r0 = (defpackage.ytk) r0
            r2 = r0
            goto L_0x03eb
        L_0x03e3:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x03ea
        L_0x03e9:
        L_0x03ea:
            r2 = r0
        L_0x03eb:
            java.lang.String r3 = r12.readString()
            java.lang.String r4 = r12.readString()
            int r5 = r12.readInt()
            java.lang.String r6 = r12.readString()
            r1 = r10
            r1.a((defpackage.ytk) r2, (java.lang.String) r3, (java.lang.String) r4, (int) r5, (java.lang.String) r6)
            r13.writeNoException()
            goto L_0x0525
        L_0x0404:
            java.lang.String r11 = r12.readString()
            java.lang.String r12 = r12.readString()
            r10.a((java.lang.String) r11, (java.lang.String) r12)
            r13.writeNoException()
            goto L_0x0525
        L_0x0414:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x042b
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x0425
            ytk r0 = (defpackage.ytk) r0
            goto L_0x042c
        L_0x0425:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x042c
        L_0x042b:
        L_0x042c:
            java.lang.String r11 = r12.readString()
            r10.d(r0, r11)
            r13.writeNoException()
            goto L_0x0525
        L_0x0438:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x044f
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x0449
            ytk r0 = (defpackage.ytk) r0
            goto L_0x0450
        L_0x0449:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x0450
        L_0x044f:
        L_0x0450:
            android.os.Parcelable$Creator r11 = android.net.Uri.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r12, (android.os.Parcelable.Creator) r11)
            android.net.Uri r11 = (android.net.Uri) r11
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r12, (android.os.Parcelable.Creator) r1)
            android.os.Bundle r12 = (android.os.Bundle) r12
            r10.a((defpackage.ytk) r0, (android.net.Uri) r11, (android.os.Bundle) r12)
            r13.writeNoException()
            goto L_0x0525
        L_0x0468:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x0480
            android.os.IInterface r12 = r11.queryLocalInterface(r1)
            boolean r0 = r12 instanceof defpackage.ytk
            if (r0 == 0) goto L_0x047a
            r0 = r12
            ytk r0 = (defpackage.ytk) r0
            goto L_0x0481
        L_0x047a:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x0481
        L_0x0480:
        L_0x0481:
            r10.a(r0)
            r13.writeNoException()
            goto L_0x0525
        L_0x0489:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x04a0
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x049a
            ytk r0 = (defpackage.ytk) r0
            goto L_0x04a1
        L_0x049a:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x04a1
        L_0x04a0:
        L_0x04a1:
            java.lang.String r11 = r12.readString()
            r10.c((defpackage.ytk) r0, (java.lang.String) r11)
            r13.writeNoException()
            goto L_0x0525
        L_0x04ad:
            java.lang.String r11 = r10.b()
            r13.writeNoException()
            r13.writeString(r11)
            goto L_0x0525
        L_0x04b9:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x04d0
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x04ca
            ytk r0 = (defpackage.ytk) r0
            goto L_0x04d1
        L_0x04ca:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x04d1
        L_0x04d0:
        L_0x04d1:
            java.lang.String r11 = r12.readString()
            r10.b((defpackage.ytk) r0, (java.lang.String) r11)
            r13.writeNoException()
            goto L_0x0525
        L_0x04dc:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x04f3
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x04ed
            ytk r0 = (defpackage.ytk) r0
            goto L_0x04f4
        L_0x04ed:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x04f4
        L_0x04f3:
        L_0x04f4:
            java.lang.String r11 = r12.readString()
            java.lang.String r12 = r12.readString()
            r10.a((defpackage.ytk) r0, (java.lang.String) r11, (java.lang.String) r12)
            r13.writeNoException()
            goto L_0x0525
        L_0x0503:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x051a
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ytk
            if (r1 == 0) goto L_0x0514
            ytk r0 = (defpackage.ytk) r0
            goto L_0x051b
        L_0x0514:
            yti r0 = new yti
            r0.<init>(r11)
            goto L_0x051b
        L_0x051a:
        L_0x051b:
            java.lang.String r11 = r12.readString()
            r10.a((defpackage.ytk) r0, (java.lang.String) r11)
            r13.writeNoException()
        L_0x0525:
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ytm.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
