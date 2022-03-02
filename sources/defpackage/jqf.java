package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.contactsheet.card.common.CardButton;
import com.google.android.gms.contactsheet.card.common.ExpandableLinearLayout;

/* renamed from: jqf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jqf implements ax {
    public final jtf a;
    public final ExpandableLinearLayout b;
    public final ExpandableLinearLayout c;
    public final ExpandableLinearLayout d;
    public final CardButton e;
    public final Context f;
    public boolean g;
    private final View h;
    private final String i;

    public jqf(View view, String str, jtf jtf) {
        this.h = view;
        this.f = view.getContext();
        this.i = str;
        this.a = jtf;
        CardButton cardButton = (CardButton) view.findViewById(R.id.card_button);
        this.e = cardButton;
        cardButton.setOnClickListener(new jqa(this));
        this.b = (ExpandableLinearLayout) view.findViewById(R.id.email);
        this.c = (ExpandableLinearLayout) view.findViewById(R.id.phone);
        this.d = (ExpandableLinearLayout) view.findViewById(R.id.address);
        view.setVisibility(8);
    }

    public static String a(Context context, int i2) {
        int i3 = i2 - 1;
        if (i3 == 1) {
            return context.getString(R.string.gm_contact_info_source_context_google_profile);
        }
        if (i3 != 2) {
            return i3 != 3 ? "" : context.getString(R.string.gm_contact_info_source_context_directory_profile);
        }
        return context.getString(R.string.gm_contact_info_source_context_google_contacts);
    }

    private static final jru a(String str, String str2, String str3) {
        jru a2 = jru.a();
        a2.a = str;
        if (!TextUtils.isEmpty(str2)) {
            a2.b = str2;
            a2.c = str3;
        } else {
            a2.b = str3;
        }
        return a2;
    }

    public final void a() {
        this.g = false;
        this.e.a();
        this.b.a(2);
        this.c.a(2);
        this.d.a(2);
    }

    public final void a(amri amri) {
        this.b.removeAllViews();
        this.c.removeAllViews();
        this.d.removeAllViews();
        this.b.setVisibility(8);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        if (amri.a()) {
            jsj jsj = (jsj) amri.b();
            int i2 = 4;
            if (jsj.a().a() && !((amzy) jsj.a().b()).isEmpty()) {
                amzy amzy = (amzy) jsj.a().b();
                int i3 = 0;
                while (i3 < amzy.size()) {
                    avhx avhx = (avhx) amzy.get(i3);
                    String str = avhx.b;
                    String str2 = avhx.c;
                    Context context = this.f;
                    int a2 = avhw.a(avhx.d);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    jru a3 = a(str, str2, a(context, a2));
                    int i4 = i3 + 1;
                    a3.f = this.f.getString(R.string.contact_info_email_content_description, new Object[]{Integer.valueOf(i4), Integer.valueOf(amzy.size()), avhx.c, avhx.b});
                    Intent a4 = jrv.a(avhx.b, this.i);
                    if (a4.resolveActivity(this.f.getPackageManager()) != null) {
                        a3.i = new jqb(this, a4);
                    }
                    if (i3 == 0) {
                        a3.d = uj.b(this.f, R.drawable.quantum_gm_ic_email_vd_theme_24);
                    } else {
                        a3.b();
                    }
                    ExpandableLinearLayout expandableLinearLayout = this.b;
                    expandableLinearLayout.addView(a3.a(this.f, expandableLinearLayout));
                    i3 = i4;
                }
                this.b.setVisibility(0);
            }
            if (jsj.b().a() && !((amzy) jsj.b().b()).isEmpty()) {
                amzy amzy2 = (amzy) jsj.b().b();
                int i5 = 0;
                while (i5 < amzy2.size()) {
                    avhy avhy = (avhy) amzy2.get(i5);
                    String str3 = avhy.b;
                    String str4 = avhy.c;
                    Context context2 = this.f;
                    int a5 = avhw.a(avhy.d);
                    if (a5 == 0) {
                        a5 = 1;
                    }
                    jru a6 = a(str3, str4, a(context2, a5));
                    int i6 = i5 + 1;
                    a6.f = this.f.getString(R.string.contact_info_phone_content_description, new Object[]{Integer.valueOf(i6), Integer.valueOf(amzy2.size()), avhy.c, avhy.b});
                    Intent a7 = jrv.a(avhy.b);
                    if (a7.resolveActivity(this.f.getPackageManager()) != null) {
                        a6.i = new jqc(this, a7);
                    }
                    String str5 = avhy.b;
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    String valueOf = String.valueOf(str5);
                    intent.setData(Uri.parse(valueOf.length() == 0 ? new String("smsto:") : "smsto:".concat(valueOf)));
                    if (intent.resolveActivity(this.f.getPackageManager()) != null) {
                        a6.e = uj.b(this.f, R.drawable.quantum_gm_ic_chat_vd_theme_24);
                        a6.k = new jqd(this, intent);
                        if (azho.a.a().c()) {
                            a6.h = this.f.getString(R.string.send_sms_content_description);
                        }
                    }
                    if (i5 == 0) {
                        a6.d = uj.b(this.f, R.drawable.quantum_ic_call_vd_theme_24);
                    } else {
                        a6.b();
                    }
                    ExpandableLinearLayout expandableLinearLayout2 = this.c;
                    expandableLinearLayout2.addView(a6.a(this.f, expandableLinearLayout2));
                    i5 = i6;
                }
                this.c.setVisibility(0);
            }
            if (jsj.c().a() && !((amzy) jsj.c().b()).isEmpty()) {
                amzy amzy3 = (amzy) jsj.c().b();
                int i7 = 0;
                while (i7 < amzy3.size()) {
                    avhu avhu = (avhu) amzy3.get(i7);
                    String str6 = avhu.b;
                    String str7 = avhu.c;
                    Context context3 = this.f;
                    int a8 = avhw.a(avhu.d);
                    if (a8 == 0) {
                        a8 = 1;
                    }
                    jru a9 = a(str6, str7, a(context3, a8));
                    Context context4 = this.f;
                    Object[] objArr = new Object[i2];
                    int i8 = i7 + 1;
                    objArr[0] = Integer.valueOf(i8);
                    objArr[1] = Integer.valueOf(amzy3.size());
                    objArr[2] = avhu.c;
                    objArr[3] = avhu.b.replace('-', ' ');
                    a9.f = context4.getString(R.string.contact_info_address_content_description, objArr);
                    Intent a10 = jrp.a(avhu.b);
                    if (a10.resolveActivity(this.f.getPackageManager()) != null) {
                        a9.i = new jqe(this, a10);
                    }
                    if (i7 == 0) {
                        a9.d = uj.b(this.f, R.drawable.quantum_gm_ic_location_on_vd_theme_24);
                    } else {
                        a9.b();
                    }
                    ExpandableLinearLayout expandableLinearLayout3 = this.d;
                    expandableLinearLayout3.addView(a9.a(this.f, expandableLinearLayout3));
                    i7 = i8;
                    i2 = 4;
                }
                this.d.setVisibility(0);
            }
            if (this.b.getChildCount() > 2 || this.c.getChildCount() > 2 || this.d.getChildCount() > 2) {
                this.e.setVisibility(0);
                a();
            } else {
                this.e.setVisibility(8);
            }
            if (this.b.getChildCount() != 0 || this.c.getChildCount() != 0 || this.d.getChildCount() != 0) {
                this.h.setVisibility(0);
            }
        }
    }
}
