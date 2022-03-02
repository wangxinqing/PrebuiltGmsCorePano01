package defpackage;

import android.content.Intent;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.Log;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.plus.model.posts.PlusPage;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: zms  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zms {
    public String a;
    public PlusPage b;
    public String c;
    public int d;
    public String e;
    public String f;
    public String g;
    public String h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public String m;
    public String n;
    public zmx o;
    public zmw p;
    public Audience q;
    public AudienceMember r;
    public String s;

    public zms(Intent intent) {
        Audience audience;
        CharSequence charSequenceExtra;
        this.a = intent.getStringExtra("com.google.android.gms.plus.intent.extra.ACCOUNT");
        this.n = intent.getStringExtra("com.google.android.apps.plus.CONTENT_URL");
        this.o = zmx.a(intent.getExtras());
        this.p = zmw.a(intent.getBundleExtra("com.google.android.apps.plus.CALL_TO_ACTION"));
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.android.apps.plus.RECIPIENT_IDS");
        if (stringArrayListExtra != null) {
            int size = stringArrayListExtra.size();
            ArrayList arrayList = new ArrayList(size);
            int intValue = ((Integer) ysu.A.c()).intValue();
            int i2 = 0;
            while (i2 < size && i2 < intValue) {
                arrayList.add(AudienceMember.a(stringArrayListExtra.get(i2), (String) null, (String) null));
                i2++;
            }
            if (size != arrayList.size()) {
                StringBuilder sb = new StringBuilder(90);
                sb.append("Only ");
                sb.append(intValue);
                sb.append(" recipients can be pre-populated in a post.  Some recipients were removed.");
                Log.w("GooglePlusPlatform", sb.toString());
            }
            iww iww = new iww();
            iww.a((Collection) arrayList);
            audience = iww.a();
        } else {
            audience = null;
        }
        this.q = audience;
        this.r = (AudienceMember) intent.getParcelableExtra("com.google.android.gms.plus.intent.extra.INTERNAL_PREFILLED_PLUS_MENTION");
        this.i = 0;
        this.j = ((Boolean) ysu.T.c()).booleanValue();
        this.k = ((Boolean) ysu.U.c()).booleanValue();
        this.l = ((Boolean) ysu.V.c()).booleanValue();
        if (intent.hasExtra("android.intent.extra.TEXT")) {
            String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
            this.s = stringExtra;
            if (stringExtra == null && (charSequenceExtra = intent.getCharSequenceExtra("android.intent.extra.TEXT")) != null) {
                this.s = charSequenceExtra.toString();
            }
        }
        if (f()) {
            a(this.o.c());
        }
        if (h()) {
            String str = this.s;
            a(str);
            if (this.n != null && str != null && str.trim().equals(this.n)) {
                this.s = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            SpannableString spannableString = new SpannableString(str);
            Linkify.addLinks(spannableString, 1);
            URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
            if (uRLSpanArr.length > 0) {
                this.n = uRLSpanArr[0].getURL();
            }
        }
    }

    public final String b() {
        if (c()) {
            return this.b.b;
        }
        return null;
    }

    public final boolean c() {
        PlusPage plusPage = this.b;
        return plusPage != null && !TextUtils.isEmpty(plusPage.b);
    }

    public final boolean d() {
        return this.m != null;
    }

    public final boolean e() {
        return !TextUtils.isEmpty(this.n);
    }

    public final boolean f() {
        return this.o != null;
    }

    public final boolean g() {
        return this.p != null;
    }

    public final boolean h() {
        return !TextUtils.isEmpty(this.s);
    }

    public final boolean a() {
        return !TextUtils.isEmpty(this.a);
    }
}
