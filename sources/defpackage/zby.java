package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.model.posts.Post;

/* renamed from: zby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zby extends zax {
    private final ClientContext a;
    private final ytk b;
    private final Post c;

    public zby(ClientContext clientContext, ytk ytk, Post post) {
        this.a = clientContext;
        this.b = ytk;
        this.c = post;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        android.util.Log.e("PlusWhitelistedAgent", "Network operation interrupted", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x022d, code lost:
        throw new com.android.volley.VolleyError((java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x022e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x022f, code lost:
        defpackage.jad.a(r0, "LoadPostSettingsOp");
        r1.b.a(7, (android.os.Bundle) null, (com.google.android.gms.plus.model.posts.Settings) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x023b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x023d, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x024b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x024c, code lost:
        r3 = new android.os.Bundle();
        r3.putParcelable("pendingIntent", android.app.PendingIntent.getActivity(r2, 0, r0.a(), 0));
        r1.b.a(4, r3, (com.google.android.gms.plus.model.posts.Settings) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0266, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ec, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0220, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x022e A[ExcHandler: VolleyError (r0v7 'e' com.android.volley.VolleyError A[CUSTOM_DECLARE]), Splitter:B:1:0x0004] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x024b A[ExcHandler: UserRecoverableAuthException (r0v0 'e' com.google.android.gms.auth.UserRecoverableAuthException A[CUSTOM_DECLARE]), Splitter:B:1:0x0004] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r27, defpackage.yrr r28) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            com.google.android.gms.common.internal.ClientContext r0 = r1.a     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            com.google.android.gms.plus.model.posts.Post r12 = r1.c     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            r6 = r28
            ysd r13 = r6.c     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            jhi r14 = defpackage.jhi.a()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            izb r6 = r13.i     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            r6.d()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            java.lang.String r6 = defpackage.yxg.a(r27)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            jhi r15 = r14.b()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            java.lang.String r11 = r12.k     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            boolean r7 = android.text.TextUtils.isEmpty(r11)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            if (r7 == 0) goto L_0x0028
            java.lang.String r7 = "me"
            goto L_0x0029
        L_0x0028:
            r7 = r11
        L_0x0029:
            zdo r8 = r13.h     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            java.lang.String r9 = "sharing"
            java.lang.String r10 = r12.j     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            r3.<init>()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            java.util.Formatter r4 = new java.util.Formatter     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            r4.<init>(r3)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            java.lang.String r7 = defpackage.iyv.a(r7)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            r16 = 0
            r5[r16] = r7     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            java.lang.String r7 = defpackage.iyv.a(r9)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            r9 = 1
            r5[r9] = r7     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            java.lang.String r7 = "people/%1$s/settings/%2$s"
            r4.format(r7, r5)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            if (r10 == 0) goto L_0x005b
            java.lang.String r4 = "contextType"
            java.lang.String r5 = defpackage.iyv.a(r10)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            defpackage.iyv.a((java.lang.StringBuilder) r3, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
        L_0x005b:
            if (r6 != 0) goto L_0x005e
            goto L_0x0067
        L_0x005e:
            java.lang.String r4 = "language"
            java.lang.String r5 = defpackage.iyv.a(r6)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            defpackage.iyv.a((java.lang.StringBuilder) r3, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
        L_0x0067:
            java.lang.String r3 = r3.toString()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            izb r6 = r8.a     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            java.lang.Class<com.google.android.gms.plus.service.v1whitelisted.models.Settings> r9 = com.google.android.gms.plus.service.v1whitelisted.models.Settings.class
            r7 = r0
            r8 = r3
            r10 = r15
            r3 = r11
            r11 = r15
            r6.a((com.google.android.gms.common.internal.ClientContext) r7, (java.lang.String) r8, (java.lang.Class) r9, (com.android.volley.Response.Listener) r10, (com.android.volley.Response.ErrorListener) r11)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            jhi r4 = r14.b()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            com.google.android.gms.common.people.data.Audience r5 = r12.l     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            if (r5 == 0) goto L_0x00b9
            java.util.List r6 = r5.b     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            int r6 = r6.size()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            if (r6 <= 0) goto L_0x00b9
            java.util.List r6 = r5.b     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            int r12 = r6.size()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            r14 = 0
        L_0x008e:
            if (r14 >= r12) goto L_0x00b9
            java.util.List r6 = r5.b     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            java.lang.Object r6 = r6.get(r14)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            com.google.android.gms.common.people.data.AudienceMember r6 = (com.google.android.gms.common.people.data.AudienceMember) r6     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            java.lang.String r6 = r6.e     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            java.lang.String r7 = defpackage.ycm.e(r6)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            if (r7 == 0) goto L_0x00b6
            zdm r7 = r13.f     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            java.lang.String r6 = defpackage.ycm.e(r6)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            iyu r8 = defpackage.ysd.j     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            java.lang.String r8 = defpackage.zdm.a(r8, r6, r3)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            izb r6 = r7.a     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            java.lang.Class<com.google.android.gms.plus.service.v1whitelisted.models.PersonEntity> r9 = com.google.android.gms.plus.service.v1whitelisted.models.PersonEntity.class
            r7 = r0
            r10 = r4
            r11 = r4
            r6.a((com.google.android.gms.common.internal.ClientContext) r7, (java.lang.String) r8, (java.lang.Class) r9, (com.android.volley.Response.Listener) r10, (com.android.volley.Response.ErrorListener) r11)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
        L_0x00b6:
            int r14 = r14 + 1
            goto L_0x008e
        L_0x00b9:
            izb r0 = r13.i     // Catch:{ InterruptedException -> 0x0220 }
            r0.e()     // Catch:{ InterruptedException -> 0x0220 }
            r15.c()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            ikz r0 = defpackage.ysu.P     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            java.lang.Object r0 = r0.c()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            boolean r0 = r0.booleanValue()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            ikz r3 = defpackage.ysu.Q     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            java.lang.Object r3 = r3.c()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            int r3 = r3.intValue()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            ikz r5 = defpackage.ysu.R     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            java.lang.Object r5 = r5.c()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            int r5 = r5.intValue()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            ikz r6 = defpackage.ysu.S     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            java.lang.Object r6 = r6.c()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            int r6 = r6.intValue()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            boolean r7 = r15.d()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            if (r7 == 0) goto L_0x01b3
            r7 = 0
            jag r8 = r15.a((int) r7)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            com.google.android.gms.plus.service.v1whitelisted.models.Settings r8 = (com.google.android.gms.plus.service.v1whitelisted.models.Settings) r8     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            java.util.List r7 = r8.c     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            int r8 = r7.size()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0107:
            if (r10 >= r8) goto L_0x01a8
            java.lang.Object r12 = r7.get(r10)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            zib r12 = (defpackage.zib) r12     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            java.lang.String r13 = "sharing.defaultAccess"
            java.lang.String r14 = r12.f()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            boolean r13 = r13.equals(r14)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            if (r13 != 0) goto L_0x011c
            goto L_0x012c
        L_0x011c:
            boolean r13 = r12.c()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            if (r13 == 0) goto L_0x012c
            zej r9 = r12.b()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            com.google.android.gms.common.people.data.Audience r9 = defpackage.yxf.b(r9)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            goto L_0x01a4
        L_0x012c:
            java.lang.String r13 = "sharing.underageWarning"
            java.lang.String r14 = r12.f()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            boolean r13 = r13.equals(r14)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            if (r13 != 0) goto L_0x0139
            goto L_0x0144
        L_0x0139:
            boolean r13 = r12.e()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            if (r13 == 0) goto L_0x0144
            boolean r11 = r12.d()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            goto L_0x01a4
        L_0x0144:
            java.lang.String r13 = "sharing.showAclPickerFirst"
            java.lang.String r14 = r12.f()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            boolean r13 = r13.equals(r14)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            if (r13 != 0) goto L_0x0151
            goto L_0x015c
        L_0x0151:
            boolean r13 = r12.e()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            if (r13 == 0) goto L_0x015c
            boolean r0 = r12.d()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            goto L_0x01a4
        L_0x015c:
            java.lang.String r13 = "sharing.showcasedSuggestionCount"
            java.lang.String r14 = r12.f()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            boolean r13 = r13.equals(r14)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            if (r13 != 0) goto L_0x0169
            goto L_0x0174
        L_0x0169:
            boolean r13 = r12.h()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            if (r13 == 0) goto L_0x0174
            int r3 = r12.g()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            goto L_0x01a4
        L_0x0174:
            java.lang.String r13 = "sharing.suggestionCount"
            java.lang.String r14 = r12.f()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            boolean r13 = r13.equals(r14)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            if (r13 != 0) goto L_0x0181
            goto L_0x018c
        L_0x0181:
            boolean r13 = r12.h()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            if (r13 == 0) goto L_0x018c
            int r5 = r12.g()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            goto L_0x01a4
        L_0x018c:
            java.lang.String r13 = "sharing.clientSuggestionCount"
            java.lang.String r14 = r12.f()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            boolean r13 = r13.equals(r14)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            if (r13 != 0) goto L_0x0199
            goto L_0x01a4
        L_0x0199:
            boolean r13 = r12.h()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            if (r13 != 0) goto L_0x01a0
            goto L_0x01a4
        L_0x01a0:
            int r6 = r12.g()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
        L_0x01a4:
            int r10 = r10 + 1
            goto L_0x0107
        L_0x01a8:
            r22 = r0
            r23 = r3
            r24 = r5
            r25 = r6
            r21 = r11
            goto L_0x01be
        L_0x01b3:
            r22 = r0
            r23 = r3
            r24 = r5
            r25 = r6
            r9 = 0
            r21 = 0
        L_0x01be:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            r0.<init>()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            boolean r3 = r4.d()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            if (r3 != 0) goto L_0x01ca
            goto L_0x01ee
        L_0x01ca:
            r3 = 0
        L_0x01cb:
            java.util.ArrayList r5 = r4.a     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            int r5 = r5.size()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            if (r3 >= r5) goto L_0x01ee
            jag r5 = r4.a((int) r3)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            com.google.android.gms.plus.service.v1whitelisted.models.PersonEntity r5 = (com.google.android.gms.plus.service.v1whitelisted.models.PersonEntity) r5     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            if (r5 != 0) goto L_0x01dc
            goto L_0x01e8
        L_0x01dc:
            java.lang.String r6 = r5.f     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            java.lang.String r5 = r5.c     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            r7 = 0
            com.google.android.gms.common.people.data.AudienceMember r5 = com.google.android.gms.common.people.data.AudienceMember.a(r6, r5, r7)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x01eb, VolleyError -> 0x022e }
            r0.add(r5)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
        L_0x01e8:
            int r3 = r3 + 1
            goto L_0x01cb
        L_0x01eb:
            r0 = move-exception
            r3 = r7
            goto L_0x023e
        L_0x01ee:
            boolean r3 = r0.isEmpty()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            if (r3 != 0) goto L_0x0208
            iww r3 = new iww     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            r3.<init>()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            r3.a((java.util.Collection) r0)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            int r0 = r9.c     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            r3.a((int) r0)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            com.google.android.gms.common.people.data.Audience r0 = r3.a()     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            r20 = r0
            goto L_0x020a
        L_0x0208:
            r20 = 0
        L_0x020a:
            com.google.android.gms.plus.model.posts.Settings r0 = new com.google.android.gms.plus.model.posts.Settings     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            r18 = 2
            r17 = r0
            r19 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            ytk r3 = r1.b     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            r4 = 0
            r5 = 0
            r3.a((int) r5, (android.os.Bundle) r4, (com.google.android.gms.plus.model.posts.Settings) r0)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x021d, VolleyError -> 0x022e }
            return
        L_0x021d:
            r0 = move-exception
            r3 = r4
            goto L_0x023e
        L_0x0220:
            r0 = move-exception
            java.lang.String r3 = "PlusWhitelistedAgent"
            java.lang.String r4 = "Network operation interrupted"
            android.util.Log.e(r3, r4, r0)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            com.android.volley.VolleyError r3 = new com.android.volley.VolleyError     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            r3.<init>((java.lang.Throwable) r0)     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
            throw r3     // Catch:{ UserRecoverableAuthException -> 0x024b, eif -> 0x023c, VolleyError -> 0x022e }
        L_0x022e:
            r0 = move-exception
            java.lang.String r2 = "LoadPostSettingsOp"
            defpackage.jad.a(r0, r2)
            ytk r0 = r1.b
            r2 = 7
            r3 = 0
            r0.a((int) r2, (android.os.Bundle) r3, (com.google.android.gms.plus.model.posts.Settings) r3)
            return
        L_0x023c:
            r0 = move-exception
            r3 = 0
        L_0x023e:
            com.google.android.gms.common.internal.ClientContext r0 = r1.a
            android.os.Bundle r0 = defpackage.yug.a(r2, r0)
            ytk r2 = r1.b
            r4 = 4
            r2.a((int) r4, (android.os.Bundle) r0, (com.google.android.gms.plus.model.posts.Settings) r3)
            return
        L_0x024b:
            r0 = move-exception
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            android.content.Intent r0 = r0.a()
            r4 = 0
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r2, r4, r0, r4)
            java.lang.String r2 = "pendingIntent"
            r3.putParcelable(r2, r0)
            ytk r0 = r1.b
            r2 = 4
            r4 = 0
            r0.a((int) r2, (android.os.Bundle) r3, (com.google.android.gms.plus.model.posts.Settings) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zby.a(android.content.Context, yrr):void");
    }
}
