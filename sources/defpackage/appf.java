package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.UserManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.api.gms.internal.SmsCodeAutoRetriever;
import com.google.firebase.auth.api.model.SendVerificationCodeRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: appf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class appf implements Handler.Callback {
    public static final iwd a = new iwd("FirebaseAuth", "PhoneVerificationSession");
    public final jfo b;
    public final jfp c;
    public final List d = new ArrayList();
    final boolean e;
    public boolean f = true;
    SmsCodeAutoRetriever g;
    int h = 1;
    String i;
    String j;
    public String k;
    private final List l = new ArrayList();
    private final aptv m;
    private final String n;
    private boolean o;

    public appf(aptv aptv, String str, boolean z, jfp jfp) {
        a.d("PhoneVerificationSession constructor", new Object[0]);
        this.m = aptv;
        this.n = str;
        this.e = z;
        this.c = jfp;
        this.b = new jfo(this.c, this);
        this.i = "";
    }

    public static final void a(List list, appd appd, Object... objArr) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            aptg aptg = (aptg) ((WeakReference) list.get(i2)).get();
            if (aptg != null) {
                appd.a(aptg, objArr);
            }
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.h != 5;
    }

    public final void b() {
        a(this.l, new apoz(this), new Object[0]);
    }

    public final void c() {
        a(this.d, new appa(this), new Object[0]);
    }

    public final boolean handleMessage(Message message) {
        boolean z;
        boolean z2;
        String str;
        Message message2 = message;
        int i2 = message2.what;
        boolean z3 = false;
        if (i2 == 1) {
            Object[] objArr = (Object[]) message2.obj;
            Context context = (Context) objArr[0];
            apte apte = (apte) objArr[1];
            aptg aptg = (aptg) objArr[2];
            boolean booleanValue = ((Boolean) objArr[3]).booleanValue();
            this.l.add(new WeakReference(aptg));
            this.d.add(new WeakReference(aptg));
            apox apox = apox.a;
            if (booleanValue || !apox.a(context, this.n, true)) {
                if (this.h == 1) {
                    this.h = 2;
                    Context applicationContext = context.getApplicationContext();
                    SmsCodeAutoRetriever smsCodeAutoRetriever = new SmsCodeAutoRetriever(applicationContext, new apoy(this, applicationContext));
                    this.g = smsCodeAutoRetriever;
                    Context context2 = smsCodeAutoRetriever.a;
                    jnh b2 = jni.b(context2);
                    int a2 = b2.a("android.permission.READ_PHONE_STATE");
                    int a3 = b2.a("android.permission.RECEIVE_SMS");
                    if (a2 != 0) {
                        z = false;
                    } else {
                        if (a3 == 0) {
                            int i3 = Build.VERSION.SDK_INT;
                            if (!((UserManager) context2.getSystemService("user")).hasUserRestriction("no_sms")) {
                                z = true;
                            }
                        }
                        z = false;
                    }
                    Context context3 = smsCodeAutoRetriever.a;
                    PackageManager packageManager = context3.getPackageManager();
                    TelephonyManager telephonyManager = (TelephonyManager) context3.getSystemService("phone");
                    if (SmsCodeAutoRetriever.a() || !packageManager.hasSystemFeature("android.hardware.telephony")) {
                        z2 = false;
                    } else {
                        z2 = telephonyManager.getPhoneType() != 0;
                    }
                    boolean a4 = SmsCodeAutoRetriever.a();
                    if (z && z2 && !a4) {
                        smsCodeAutoRetriever.a.registerReceiver(smsCodeAutoRetriever, new IntentFilter("android.provider.Telephony.SMS_RECEIVED"));
                        smsCodeAutoRetriever.b = true;
                        z3 = true;
                    }
                    this.f = z3;
                    appe appe = new appe(this, aptg);
                    aptv aptv = this.m;
                    if (aptv instanceof SendVerificationCodeRequest) {
                        SendVerificationCodeRequest sendVerificationCodeRequest = (SendVerificationCodeRequest) aptv;
                        appe appe2 = new appe(this, appe);
                        iva.c(sendVerificationCodeRequest.a);
                        iva.a((Object) appe2);
                        apte.b.a(sendVerificationCodeRequest, new apuw(), axic.c(), "sendVerificationCode", sendVerificationCodeRequest.d).a((acvp) new apqa(new aprz(appe2)));
                    } else if (aptv instanceof apvd) {
                        apvd apvd = (apvd) aptv;
                        iva.a((Object) apvd);
                        iva.a((Object) appe);
                        apte.b.a(apvd, new apve(), axif.c(), "mfaSignIn:start", apvd.c).a((acvp) new appp(new apsq(appe)));
                    } else {
                        apvb apvb = (apvb) aptv;
                        iva.a((Object) apvb);
                        iva.a((Object) appe);
                        apte.b.a(apvb, new apvc(), axif.c(), "mfaEnrollment:start", apvb.a).a((acvp) new appm(new apsl(appe)));
                    }
                }
                int i4 = this.h;
                if (i4 == 3 || i4 == 4) {
                    b();
                }
                if (this.h == 4) {
                    a(true);
                }
            } else {
                a.d("PhoneVerificationSession instant validation", new Object[0]);
                this.h = 5;
                String str2 = this.k;
                if (str2 == null) {
                    str = this.n;
                } else {
                    str = null;
                }
                aptg.a(new PhoneAuthCredential((String) null, (String) null, true, str, true, (String) null, str2));
            }
        } else if (i2 == 2) {
            Object[] objArr2 = (Object[]) message2.obj;
            Context context4 = (Context) objArr2[0];
            String str3 = (String) objArr2[1];
            if (((Boolean) objArr2[2]).booleanValue()) {
                apox.a.b(context4, this.n);
            }
            if (this.e) {
                this.j = str3;
                if (!TextUtils.isEmpty(this.i)) {
                    a(false);
                }
            }
            this.h = 4;
        } else if (i2 != 3) {
            iwd iwd = a;
            int i5 = message2.what;
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i5);
            iwd.d(sb.toString(), new Object[0]);
            return false;
        } else {
            Integer num = (Integer) message2.obj;
            if (num == null || this.h == num.intValue()) {
                if (this.e) {
                    c();
                }
                if (this.h == 3 && this.f) {
                    this.g.a((List) null, false);
                }
                this.h = 5;
                a.d("PhoneVerificationSession terminated", new Object[0]);
            }
        }
        return true;
    }

    public final synchronized void a(boolean z) {
        if (!z) {
            if (this.o) {
                return;
            }
        }
        this.o = true;
        a(this.d, new appb(this), new Object[0]);
    }
}
