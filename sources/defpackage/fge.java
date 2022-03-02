package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;

/* renamed from: fge  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fge extends bhw implements fgf {
    public final Context a;
    private final fcy b;
    private final String c;

    public fge() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService");
    }

    private final void a(fcu fcu, fgb fgb) {
        aorl.a(this.b.a(fcu, this.c), new fnq(fgb, false), aoqm.a);
    }

    private final void b(fcu fcu, fgb fgb) {
        aorl.a(this.b.a(fcu, this.c), new fnr(fgb, ampu.a), aoqm.a);
    }

    private final void c(fcu fcu, fgb fgb) {
        aorl.a(this.b.a(fcu, this.c), new fns(fgb, amzy.h()), aoqm.a);
    }

    public fge(Context context, String str) {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService");
        this.a = context;
        this.b = (fcy) fcy.a.a();
        if (TextUtils.isEmpty(str)) {
            str = qbw.a();
        } else {
            amrl.a((Object) str);
        }
        this.c = str;
    }

    public final void a(fgb fgb) {
        a((fcu) new foj(this.a), fgb);
    }

    public final void a(fgb fgb, Account account) {
        b(fdc.a(qbk.AUTH_API_CREDENTIALS_INTERNAL_GET_ACCOUNT_SETTINGS, new fnk(this, account)), fgb);
    }

    public final void b(fgb fgb, Account account, boolean z) {
        a(fdc.a(qbk.AUTH_API_CREDENTIALS_INTERNAL_SET_AUTO_SIGNIN_ENABLED, new fnm(this, account, z)), fgb);
    }

    public final void a(fgb fgb, Account account, String str, Credential credential) {
        b(fdc.a(qbk.AUTH_API_CREDENTIALS_INTERNAL_SAVE_CREDENTIAL, new fnj(this, account, str, credential)), fgb);
    }

    public final void a(fgb fgb, Account account, String str, Credential credential, boolean z, String str2, String str3) {
        fgb fgb2 = fgb;
        b(fdc.a(qbk.AUTH_API_CREDENTIALS_INTERNAL_GET_FULL_CREDENTIAL, new fni(this, account, str, credential, z, str2, str3)), fgb);
    }

    public final void a(fgb fgb, Account account, String str, String str2, String str3) {
        b(new foh(this.a, account, str, str2, str3), fgb);
    }

    public final void a(fgb fgb, Account account, String str, boolean z) {
        a(fdc.a(qbk.AUTH_API_CREDENTIALS_INTERNAL_SET_APP_NEVER_SAVE, new fno(this, account, str, z)), fgb);
    }

    public final void a(fgb fgb, Account account, boolean z) {
        a(fdc.a(qbk.AUTH_API_CREDENTIALS_INTERNAL_SET_SERVICE_ENABLED, new fnl(this, account, z)), fgb);
    }

    public final void a(fgb fgb, HintRequest hintRequest) {
        c(new fof(this.a, hintRequest), fgb);
    }

    public final void a(fgb fgb, String str, CredentialRequest credentialRequest) {
        c(new fnv(this.a, str, credentialRequest), fgb);
    }

    public final void a(fgb fgb, String str, boolean z) {
        a(fdc.a(qbk.AUTH_API_CREDENTIALS_INTERNAL_SET_AUTO_SIGNIN_ENABLED_FOR_APP, new fnn(str, z)), fgb);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v4, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v5, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v7, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v8, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r12v5, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v10, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v11, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v12, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v14, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v16, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 12 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r11, android.os.Parcel r12, android.os.Parcel r13) {
        /*
            r10 = this;
            java.lang.String r0 = "com.google.android.gms.auth.api.credentials.internal.IBundleCallbacks"
            r1 = 0
            switch(r11) {
                case 1: goto L_0x01f0;
                case 2: goto L_0x01cb;
                case 3: goto L_0x0189;
                case 4: goto L_0x0153;
                case 5: goto L_0x0121;
                case 6: goto L_0x00fb;
                case 7: goto L_0x00dd;
                case 8: goto L_0x00b3;
                case 9: goto L_0x0089;
                case 10: goto L_0x0063;
                case 11: goto L_0x0035;
                case 12: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r11 = 0
            return r11
        L_0x0008:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x0020
            android.os.IInterface r0 = r11.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.fgb
            if (r1 == 0) goto L_0x001a
            r1 = r0
            fgb r1 = (defpackage.fgb) r1
            goto L_0x0021
        L_0x001a:
            ffz r1 = new ffz
            r1.<init>(r11)
            goto L_0x0021
        L_0x0020:
        L_0x0021:
            java.lang.String r11 = r12.readString()
            qbk r12 = defpackage.qbk.AUTH_API_CREDENTIALS_INTERNAL_DISABLE_YOLO_SAVE_DIALOG_FOR_APP
            fnp r0 = new fnp
            r0.<init>(r11)
            fcu r11 = defpackage.fdc.a(r12, r0)
            r10.a((defpackage.fcu) r11, (defpackage.fgb) r1)
            goto L_0x0218
        L_0x0035:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x004d
            android.os.IInterface r0 = r11.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.fgb
            if (r1 == 0) goto L_0x0047
            r1 = r0
            fgb r1 = (defpackage.fgb) r1
            goto L_0x004e
        L_0x0047:
            ffz r1 = new ffz
            r1.<init>(r11)
            goto L_0x004e
        L_0x004d:
        L_0x004e:
            android.os.Parcelable$Creator r11 = android.accounts.Account.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r12, (android.os.Parcelable.Creator) r11)
            android.accounts.Account r11 = (android.accounts.Account) r11
            java.lang.String r0 = r12.readString()
            boolean r12 = defpackage.bhx.a(r12)
            r10.a((defpackage.fgb) r1, (android.accounts.Account) r11, (java.lang.String) r0, (boolean) r12)
            goto L_0x0218
        L_0x0063:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x007b
            android.os.IInterface r0 = r11.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.fgb
            if (r1 == 0) goto L_0x0075
            r1 = r0
            fgb r1 = (defpackage.fgb) r1
            goto L_0x007c
        L_0x0075:
            ffz r1 = new ffz
            r1.<init>(r11)
            goto L_0x007c
        L_0x007b:
        L_0x007c:
            java.lang.String r11 = r12.readString()
            boolean r12 = defpackage.bhx.a(r12)
            r10.a((defpackage.fgb) r1, (java.lang.String) r11, (boolean) r12)
            goto L_0x0218
        L_0x0089:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x00a1
            android.os.IInterface r0 = r11.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.fgb
            if (r1 == 0) goto L_0x009b
            r1 = r0
            fgb r1 = (defpackage.fgb) r1
            goto L_0x00a2
        L_0x009b:
            ffz r1 = new ffz
            r1.<init>(r11)
            goto L_0x00a2
        L_0x00a1:
        L_0x00a2:
            android.os.Parcelable$Creator r11 = android.accounts.Account.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r12, (android.os.Parcelable.Creator) r11)
            android.accounts.Account r11 = (android.accounts.Account) r11
            boolean r12 = defpackage.bhx.a(r12)
            r10.b(r1, r11, r12)
            goto L_0x0218
        L_0x00b3:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x00cb
            android.os.IInterface r0 = r11.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.fgb
            if (r1 == 0) goto L_0x00c5
            r1 = r0
            fgb r1 = (defpackage.fgb) r1
            goto L_0x00cc
        L_0x00c5:
            ffz r1 = new ffz
            r1.<init>(r11)
            goto L_0x00cc
        L_0x00cb:
        L_0x00cc:
            android.os.Parcelable$Creator r11 = android.accounts.Account.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r12, (android.os.Parcelable.Creator) r11)
            android.accounts.Account r11 = (android.accounts.Account) r11
            boolean r12 = defpackage.bhx.a(r12)
            r10.a((defpackage.fgb) r1, (android.accounts.Account) r11, (boolean) r12)
            goto L_0x0218
        L_0x00dd:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x00f5
            android.os.IInterface r12 = r11.queryLocalInterface(r0)
            boolean r0 = r12 instanceof defpackage.fgb
            if (r0 == 0) goto L_0x00ef
            r1 = r12
            fgb r1 = (defpackage.fgb) r1
            goto L_0x00f6
        L_0x00ef:
            ffz r1 = new ffz
            r1.<init>(r11)
            goto L_0x00f6
        L_0x00f5:
        L_0x00f6:
            r10.a(r1)
            goto L_0x0218
        L_0x00fb:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x0113
            android.os.IInterface r0 = r11.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.fgb
            if (r1 == 0) goto L_0x010d
            r1 = r0
            fgb r1 = (defpackage.fgb) r1
            goto L_0x0114
        L_0x010d:
            ffz r1 = new ffz
            r1.<init>(r11)
            goto L_0x0114
        L_0x0113:
        L_0x0114:
            android.os.Parcelable$Creator r11 = android.accounts.Account.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r12, (android.os.Parcelable.Creator) r11)
            android.accounts.Account r11 = (android.accounts.Account) r11
            r10.a((defpackage.fgb) r1, (android.accounts.Account) r11)
            goto L_0x0218
        L_0x0121:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x0139
            android.os.IInterface r0 = r11.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.fgb
            if (r1 == 0) goto L_0x0133
            r1 = r0
            fgb r1 = (defpackage.fgb) r1
            goto L_0x013a
        L_0x0133:
            ffz r1 = new ffz
            r1.<init>(r11)
            goto L_0x013a
        L_0x0139:
        L_0x013a:
            android.os.Parcelable$Creator r11 = android.accounts.Account.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r12, (android.os.Parcelable.Creator) r11)
            android.accounts.Account r11 = (android.accounts.Account) r11
            java.lang.String r0 = r12.readString()
            android.os.Parcelable$Creator r2 = com.google.android.gms.auth.api.credentials.Credential.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r12, (android.os.Parcelable.Creator) r2)
            com.google.android.gms.auth.api.credentials.Credential r12 = (com.google.android.gms.auth.api.credentials.Credential) r12
            r10.a((defpackage.fgb) r1, (android.accounts.Account) r11, (java.lang.String) r0, (com.google.android.gms.auth.api.credentials.Credential) r12)
            goto L_0x0218
        L_0x0153:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x016c
            android.os.IInterface r0 = r11.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.fgb
            if (r1 == 0) goto L_0x0166
            r1 = r0
            fgb r1 = (defpackage.fgb) r1
            r3 = r1
            goto L_0x016e
        L_0x0166:
            ffz r1 = new ffz
            r1.<init>(r11)
            goto L_0x016d
        L_0x016c:
        L_0x016d:
            r3 = r1
        L_0x016e:
            android.os.Parcelable$Creator r11 = android.accounts.Account.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r12, (android.os.Parcelable.Creator) r11)
            r4 = r11
            android.accounts.Account r4 = (android.accounts.Account) r4
            java.lang.String r5 = r12.readString()
            java.lang.String r6 = r12.readString()
            java.lang.String r7 = r12.readString()
            r2 = r10
            r2.a(r3, r4, r5, r6, r7)
            goto L_0x0218
        L_0x0189:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x01a2
            android.os.IInterface r0 = r11.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.fgb
            if (r1 == 0) goto L_0x019c
            r1 = r0
            fgb r1 = (defpackage.fgb) r1
            r3 = r1
            goto L_0x01a4
        L_0x019c:
            ffz r1 = new ffz
            r1.<init>(r11)
            goto L_0x01a3
        L_0x01a2:
        L_0x01a3:
            r3 = r1
        L_0x01a4:
            android.os.Parcelable$Creator r11 = android.accounts.Account.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r12, (android.os.Parcelable.Creator) r11)
            r4 = r11
            android.accounts.Account r4 = (android.accounts.Account) r4
            java.lang.String r5 = r12.readString()
            android.os.Parcelable$Creator r11 = com.google.android.gms.auth.api.credentials.Credential.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r12, (android.os.Parcelable.Creator) r11)
            r6 = r11
            com.google.android.gms.auth.api.credentials.Credential r6 = (com.google.android.gms.auth.api.credentials.Credential) r6
            boolean r7 = defpackage.bhx.a(r12)
            java.lang.String r8 = r12.readString()
            java.lang.String r9 = r12.readString()
            r2 = r10
            r2.a(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0218
        L_0x01cb:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x01e3
            android.os.IInterface r0 = r11.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.fgb
            if (r1 == 0) goto L_0x01dd
            r1 = r0
            fgb r1 = (defpackage.fgb) r1
            goto L_0x01e4
        L_0x01dd:
            ffz r1 = new ffz
            r1.<init>(r11)
            goto L_0x01e4
        L_0x01e3:
        L_0x01e4:
            android.os.Parcelable$Creator r11 = com.google.android.gms.auth.api.credentials.HintRequest.CREATOR
            android.os.Parcelable r11 = defpackage.bhx.a((android.os.Parcel) r12, (android.os.Parcelable.Creator) r11)
            com.google.android.gms.auth.api.credentials.HintRequest r11 = (com.google.android.gms.auth.api.credentials.HintRequest) r11
            r10.a((defpackage.fgb) r1, (com.google.android.gms.auth.api.credentials.HintRequest) r11)
            goto L_0x0218
        L_0x01f0:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x0208
            android.os.IInterface r0 = r11.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.fgb
            if (r1 == 0) goto L_0x0202
            r1 = r0
            fgb r1 = (defpackage.fgb) r1
            goto L_0x0209
        L_0x0202:
            ffz r1 = new ffz
            r1.<init>(r11)
            goto L_0x0209
        L_0x0208:
        L_0x0209:
            java.lang.String r11 = r12.readString()
            android.os.Parcelable$Creator r0 = com.google.android.gms.auth.api.credentials.CredentialRequest.CREATOR
            android.os.Parcelable r12 = defpackage.bhx.a((android.os.Parcel) r12, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.auth.api.credentials.CredentialRequest r12 = (com.google.android.gms.auth.api.credentials.CredentialRequest) r12
            r10.a((defpackage.fgb) r1, (java.lang.String) r11, (com.google.android.gms.auth.api.credentials.CredentialRequest) r12)
        L_0x0218:
            r13.writeNoException()
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fge.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
