package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.model.posts.Post;

/* renamed from: zbj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zbj extends zax {
    private final ClientContext a;
    private final ytk b;
    private final Post c;

    public zbj(ClientContext clientContext, ytk ytk, Post post) {
        this.a = clientContext;
        this.b = ytk;
        this.c = post;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0138 A[Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x013c A[Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x015a A[Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0190 A[Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r21, defpackage.yrr r22) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            r3 = 4
            r4 = 0
            r5 = 0
            zey r0 = new zey     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r0.<init>()     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            com.google.android.gms.plus.model.posts.Post r6 = r1.c     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            boolean r6 = r6.b()     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            if (r6 == 0) goto L_0x0023
            com.google.android.gms.plus.model.posts.Post r6 = r1.c     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.lang.String r6 = r6.e     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r0.a = r6     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.util.Set r6 = r0.b     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r6.add(r7)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
        L_0x0023:
            com.google.android.gms.plus.model.posts.Post r6 = r1.c     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            zeu r7 = new zeu     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r7.<init>()     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            android.os.Bundle r8 = r6.i     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r9 = 2
            r10 = 1
            if (r8 == 0) goto L_0x00d5
            boolean r8 = r8.isEmpty()     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            if (r8 != 0) goto L_0x00d5
            android.os.Bundle r8 = r6.i     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            zmx r8 = defpackage.zmx.a(r8)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            boolean r11 = r8.b()     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            if (r11 == 0) goto L_0x0049
            java.lang.String r11 = r8.a()     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r7.a(r11)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
        L_0x0049:
            boolean r11 = r8.h()     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            if (r11 == 0) goto L_0x005f
            java.lang.String r11 = r8.g()     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r7.d = r11     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.util.Set r11 = r7.g     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r12 = 6
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r11.add(r12)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
        L_0x005f:
            boolean r11 = r8.j()     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            if (r11 == 0) goto L_0x0074
            java.lang.String r11 = r8.i()     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r7.b = r11     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.util.Set r11 = r7.g     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r11.add(r12)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
        L_0x0074:
            boolean r11 = r8.l()     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            if (r11 == 0) goto L_0x00a4
            zew r11 = new zew     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r11.<init>()     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.lang.String r12 = r8.k()     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r11.a = r12     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.util.Set r12 = r11.b     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r12.add(r13)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity$ObjectEntity$AttachmentsEntity$ImageEntity r12 = new com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity$ObjectEntity$AttachmentsEntity$ImageEntity     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.util.Set r13 = r11.b     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.lang.String r11 = r11.a     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r12.<init>(r13, r11)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r7.e = r12     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.util.Set r11 = r7.g     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r12 = 10
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r11.add(r12)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
        L_0x00a4:
            boolean r11 = r8.d()     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            if (r11 == 0) goto L_0x00d4
            zev r11 = new zev     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r11.<init>()     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.lang.String r8 = r8.c()     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r11.a = r8     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.util.Set r8 = r11.b     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r8.add(r12)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity$ObjectEntity$AttachmentsEntity$DeepLinkEntity r8 = new com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity$ObjectEntity$AttachmentsEntity$DeepLinkEntity     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.util.Set r12 = r11.b     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.lang.String r11 = r11.a     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r8.<init>(r12, r11)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r7.c = r8     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.util.Set r8 = r7.g     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r11 = 5
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r8.add(r11)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            goto L_0x00d6
        L_0x00d4:
            goto L_0x00d6
        L_0x00d5:
            r10 = 0
        L_0x00d6:
            boolean r8 = r6.c()     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            if (r8 == 0) goto L_0x00e6
            android.os.Bundle r6 = r6.h     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            zmw r6 = defpackage.zmw.a((android.os.Bundle) r6)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r6.a((defpackage.zeu) r7)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            goto L_0x00ea
        L_0x00e6:
            if (r10 != 0) goto L_0x00ea
            r6 = r5
            goto L_0x00f6
        L_0x00ea:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r6.<init>()     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            zex r7 = r7.a()     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r6.add(r7)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
        L_0x00f6:
            r0.a(r6)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            zer r6 = new zer     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r6.<init>()     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            zez r0 = r0.a()     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r6.a(r0)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            com.google.android.gms.plus.model.posts.Post r0 = r1.c     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            com.google.android.gms.common.people.data.Audience r0 = r0.l     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            zej r0 = defpackage.yxf.a((com.google.android.gms.common.people.data.Audience) r0)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            com.google.android.gms.plus.service.v1whitelisted.models.AclEntity r0 = (com.google.android.gms.plus.service.v1whitelisted.models.AclEntity) r0     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r6.a = r0     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.util.Set r0 = r6.b     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r0.add(r7)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            com.google.android.gms.common.internal.ClientContext r9 = r1.a     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            com.google.android.gms.plus.model.posts.Post r0 = r1.c     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.lang.String r7 = r0.k     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.lang.String r11 = r0.j     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            boolean r0 = r0.d()     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            com.google.android.gms.plus.model.posts.Post r8 = r1.c     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.lang.String r15 = r8.f     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            zfa r6 = r6.a()     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r8 = r22
            ysd r8 = r8.c     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            boolean r10 = android.text.TextUtils.isEmpty(r7)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            if (r10 == 0) goto L_0x013c
            java.lang.String r7 = "me"
            r10 = r7
            goto L_0x013d
        L_0x013c:
            r10 = r7
        L_0x013d:
            zdg r8 = r8.b     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.lang.String r12 = defpackage.yxg.a(r21)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r4)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r17 = r6
            com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity r17 = (com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity) r17     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r13 = r14
            r6 = r15
            r15 = r0
            r16 = r6
            com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity r0 = r8.a(r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            if (r0 == 0) goto L_0x0190
            com.google.android.gms.plus.model.posts.Post r19 = new com.google.android.gms.plus.model.posts.Post     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.lang.String r7 = r0.e     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            com.google.android.gms.plus.model.posts.Post r6 = r1.c     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.util.List r8 = r6.c     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.lang.String r0 = r0.j     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            android.net.Uri r9 = android.net.Uri.parse(r0)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            com.google.android.gms.plus.model.posts.Post r0 = r1.c     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.lang.String r10 = r0.e     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.lang.String r11 = r0.f     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.lang.String r12 = r0.g     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            android.os.Bundle r13 = r0.h     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            android.os.Bundle r14 = r0.i     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.lang.String r15 = r0.j     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            boolean r0 = r0.d()     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r0)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            com.google.android.gms.plus.model.posts.Post r0 = r1.c     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            java.lang.String r6 = r0.k     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            com.google.android.gms.common.people.data.Audience r0 = r0.l     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r17 = r6
            r6 = r19
            r18 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r0 = r19
            goto L_0x0191
        L_0x0190:
            r0 = r5
        L_0x0191:
            ytk r6 = r1.b     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            r6.a((int) r4, (android.os.Bundle) r5, (com.google.android.gms.plus.model.posts.Post) r0)     // Catch:{ UserRecoverableAuthException -> 0x01b5, eif -> 0x01a8, VolleyError -> 0x0197 }
            return
        L_0x0197:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "InsertActivityOperation"
            android.util.Log.e(r3, r2, r0)
            ytk r0 = r1.b
            r2 = 7
            r0.a((int) r2, (android.os.Bundle) r5, (com.google.android.gms.plus.model.posts.Post) r5)
            return
        L_0x01a8:
            r0 = move-exception
            com.google.android.gms.common.internal.ClientContext r0 = r1.a
            android.os.Bundle r0 = defpackage.yug.a(r2, r0)
            ytk r2 = r1.b
            r2.a((int) r3, (android.os.Bundle) r0, (com.google.android.gms.plus.model.posts.Post) r5)
            return
        L_0x01b5:
            r0 = move-exception
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            android.content.Intent r0 = r0.a()
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r2, r4, r0, r4)
            java.lang.String r2 = "pendingIntent"
            r6.putParcelable(r2, r0)
            ytk r0 = r1.b
            r0.a((int) r3, (android.os.Bundle) r6, (com.google.android.gms.plus.model.posts.Post) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbj.a(android.content.Context, yrr):void");
    }
}
