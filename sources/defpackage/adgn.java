package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.udc.ConsentFlowConfig;
import com.google.android.gms.udc.ui.ResizeableIllustrationHeaderView;

/* renamed from: adgn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adgn extends adgi {
    private adff m;

    /* access modifiers changed from: protected */
    public final int a() {
        return R.layout.udc_consent_fragment_material_v2;
    }

    /* access modifiers changed from: protected */
    public final void a(adfk adfk, boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    public final void a(atzm atzm, View view) {
    }

    /* access modifiers changed from: protected */
    public final void b(atzm atzm, View view) {
        atzn atzn;
        String str;
        adgq adgq = this.c;
        atzn atzn2 = null;
        if ((atzm.a & 2) != 0) {
            atzn = atzm.c;
            if (atzn == null) {
                atzn = atzn.d;
            }
        } else {
            atzn = null;
        }
        if ((atzm.a & 8) != 0 && (atzn2 = atzm.e) == null) {
            atzn2 = atzn.d;
        }
        String str2 = this.b;
        TextView a = adgq.a(view, (int) R.id.setting);
        if (a != null) {
            if (!adgq.a(atzn)) {
                String str3 = atzn.c;
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 9);
                sb.append("<b>");
                sb.append(str3);
                sb.append(":</b> ");
                str = sb.toString();
            } else {
                str = "";
            }
            if (!adgq.a(atzn2)) {
                String valueOf = String.valueOf(str);
                String valueOf2 = String.valueOf(atzn2.c);
                str = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
            }
            if (adgq.a(a, str, true, str2)) {
                adgq.b(atzn);
                adgq.b(atzn2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(ViewGroup viewGroup, LayoutInflater layoutInflater, ConsentFlowConfig consentFlowConfig, atyx atyx) {
        double d;
        atzn atzn;
        LayoutInflater layoutInflater2 = layoutInflater;
        atyx atyx2 = atyx;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.udc_consent_container);
        a(viewGroup2);
        adfk adfk = new adfk(layoutInflater2, viewGroup2);
        if ((atyx2.a & 16) != 0) {
            atzf atzf = atyx2.d;
            if (atzf == null) {
                atzf = atzf.d;
            }
            d = adfh.a(atzf.c);
        } else {
            d = 0.0d;
        }
        ResizeableIllustrationHeaderView resizeableIllustrationHeaderView = (ResizeableIllustrationHeaderView) adfk.a(R.layout.udc_consent_header_material_v2);
        resizeableIllustrationHeaderView.a = d;
        resizeableIllustrationHeaderView.requestLayout();
        adfk adfk2 = new adfk(layoutInflater2, resizeableIllustrationHeaderView);
        View a = adfk2.a(R.layout.udc_consent_user_info_material_v2);
        if (this.m == null) {
            wlr a2 = wls.a();
            a2.a = 80;
            this.m = new adff(getContext(), a, R.id.udc_consent_user_avatar, R.id.udc_consent_username, R.id.udc_consent_identity, this.c, a2.a());
        }
        adff adff = this.m;
        Context context = getContext();
        String str = this.b;
        if ((atyx2.a & 512) != 0) {
            atzn = atyx2.h;
            if (atzn == null) {
                atzn = atzn.d;
            }
        } else {
            atzn = null;
        }
        Bitmap a3 = iqw.a(BitmapFactory.decodeResource(context.getResources(), R.drawable.avatar_placeholder));
        adff.b.setImageBitmap(a3);
        adff.c.a(str, 0, 0).a((icm) new adfd(adff, a3));
        adff.a((String) null, atzn);
        adff.d.a((wkz) null).a((icm) new adfe(adff, str, atzn));
        if ((atyx2.a & 16) != 0) {
            ImageView imageView = (ImageView) ((ViewGroup) adfk2.a(R.layout.udc_consent_header_illustration_material_v2)).findViewById(R.id.illustration);
            adgq adgq = this.c;
            atzf atzf2 = atyx2.d;
            if (atzf2 == null) {
                atzf2 = atzf.d;
            }
            adgq.a((View) imageView, (int) R.id.illustration, atzf2, this.a);
        }
        atzn atzn2 = atyx2.f;
        if (atzn2 == null) {
            atzn2 = atzn.d;
        }
        if (!adgq.a(atzn2)) {
            TextView textView = (TextView) adfk2.a(R.layout.udc_consent_header_title);
            adgq adgq2 = this.c;
            atzn atzn3 = atyx2.f;
            if (atzn3 == null) {
                atzn3 = atzn.d;
            }
            adgq2.a((View) textView, (int) R.id.header, atzn3);
        }
        atzn atzn4 = atyx2.g;
        if (atzn4 == null) {
            atzn4 = atzn.d;
        }
        if (!adgq.a(atzn4)) {
            TextView textView2 = (TextView) adfk.a(R.layout.udc_consent_product_statement);
            adgq adgq3 = this.c;
            atzn atzn5 = atyx2.g;
            if (atzn5 == null) {
                atzn5 = atzn.d;
            }
            adgq3.a((View) textView2, atzn5, this.b);
        }
        a(layoutInflater, adfk, atyx, consentFlowConfig, R.layout.udc_consent_setting_material_v2);
        aucx aucx = atyx2.j;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            atzn atzn6 = (atzn) aucx.get(i);
            if (!adgq.a(atzn6)) {
                this.c.a(adfk.a(R.layout.udc_consent_text), atzn6, this.b);
            }
        }
        atzn atzn7 = atyx2.k;
        if (atzn7 == null) {
            atzn7 = atzn.d;
        }
        if (!adgq.a(atzn7)) {
            View a4 = adfk.a(R.layout.udc_consent_footer);
            adgq adgq4 = this.c;
            atzn atzn8 = atyx2.k;
            if (atzn8 == null) {
                atzn8 = atzn.d;
            }
            adgq4.a(a4, atzn8, this.b);
        }
    }
}
