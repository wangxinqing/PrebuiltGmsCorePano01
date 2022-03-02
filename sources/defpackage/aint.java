package defpackage;

import android.os.Message;
import android.text.TextUtils;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: aint  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aint {
    private aioa a;
    private long b;
    private int c;
    private String d;
    private ains e;
    private ains f;
    private ains g;

    public aint(aioa aioa, Message message, String str, ains ains, ains ains2, ains ains3) {
        a(aioa, message, str, ains, ains2, ains3);
    }

    public final void a(aioa aioa, Message message, String str, ains ains, ains ains2, ains ains3) {
        this.a = aioa;
        this.b = System.currentTimeMillis();
        this.c = message != null ? message.what : 0;
        this.d = str;
        this.e = ains;
        this.f = ains2;
        this.g = ains3;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append("time=");
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(this.b);
        sb.append(String.format(Locale.ENGLISH, "%tm-%td %tH:%tM:%tS.%tL", new Object[]{instance, instance, instance, instance, instance, instance}));
        sb.append(" processed=");
        ains ains = this.e;
        String str4 = "<null>";
        if (ains != null) {
            str = ains.g();
        } else {
            str = str4;
        }
        sb.append(str);
        sb.append(" org=");
        ains ains2 = this.f;
        if (ains2 != null) {
            str2 = ains2.g();
        } else {
            str2 = str4;
        }
        sb.append(str2);
        sb.append(" dest=");
        ains ains3 = this.g;
        if (ains3 != null) {
            str4 = ains3.g();
        }
        sb.append(str4);
        sb.append(" what=");
        aioa aioa = this.a;
        if (aioa != null) {
            str3 = aioa.a(this.c);
        } else {
            str3 = "";
        }
        if (TextUtils.isEmpty(str3)) {
            sb.append(this.c);
            sb.append("(0x");
            sb.append(Integer.toHexString(this.c));
            sb.append(")");
        } else {
            sb.append(str3);
        }
        if (!TextUtils.isEmpty(this.d)) {
            sb.append(" ");
            sb.append(this.d);
        }
        return sb.toString();
    }
}
