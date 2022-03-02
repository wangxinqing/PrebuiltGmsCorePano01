package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.udc.ConsentFlowConfig;

/* renamed from: adgj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class adgj extends adgi {
    /* access modifiers changed from: protected */
    public int a() {
        return R.layout.udc_consent_fragment_glif;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        int i = Build.VERSION.SDK_INT;
        b();
        return onCreateView;
    }

    /* access modifiers changed from: protected */
    public final void a(adfk adfk, boolean z, boolean z2) {
        if (z) {
            adfk.a(R.layout.udc_consent_separator);
            if (z2) {
                adfk.a(R.layout.udc_consent_spacer);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(ViewGroup viewGroup, LayoutInflater layoutInflater, ConsentFlowConfig consentFlowConfig, atyx atyx) {
        boolean z;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.udc_consent_container);
        a(viewGroup2);
        adfk adfk = new adfk(layoutInflater, viewGroup2);
        ViewGroup viewGroup3 = (ViewGroup) adfk.a(R.layout.udc_consent_header);
        if (viewGroup3 != null) {
            adfk adfk2 = new adfk(layoutInflater, viewGroup3);
            if ((atyx.a & 16) != 0) {
                ImageView imageView = (ImageView) adfk2.a(R.layout.udc_consent_header_illustration_glif);
                adgq adgq = this.c;
                atzf atzf = atyx.d;
                if (atzf == null) {
                    atzf = atzf.d;
                }
                adgq.a((View) imageView, (int) R.id.illustration, atzf, this.a);
            }
            atzn atzn = atyx.f;
            if (atzn == null) {
                atzn = atzn.d;
            }
            if (!adgq.a(atzn)) {
                TextView textView = (TextView) adfk2.a(R.layout.udc_consent_header_title_glif);
                adgq adgq2 = this.c;
                atzn atzn2 = atyx.f;
                if (atzn2 == null) {
                    atzn2 = atzn.d;
                }
                adgq2.a((View) textView, (int) R.id.header, atzn2);
            }
        }
        if ((atyx.a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            View a = adfk.a(R.layout.udc_consent_product_statement_glif);
            adgq adgq3 = this.c;
            atzn atzn3 = atyx.g;
            if (atzn3 == null) {
                atzn3 = atzn.d;
            }
            adgq3.a(a, atzn3, this.b);
        }
        if ((atyx.a & 512) != 0) {
            View a2 = adfk.a(R.layout.udc_consent_identity);
            adgq adgq4 = this.c;
            atzn atzn4 = atyx.h;
            if (atzn4 == null) {
                atzn4 = atzn.d;
            }
            adgq4.a(a2, (int) R.id.header, atzn4);
            adfk.a(R.layout.udc_consent_separator);
        }
        boolean a3 = a(layoutInflater, adfk, atyx, consentFlowConfig, R.layout.udc_consent_setting_glif);
        aucx aucx = atyx.j;
        int size = aucx.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            atzn atzn5 = (atzn) aucx.get(i);
            if (!adgq.a(atzn5)) {
                if (!a3) {
                    z = false;
                } else {
                    z = z2;
                }
                a(adfk, z, true);
                this.c.a(adfk.a(R.layout.udc_consent_text_glif), atzn5, this.b);
                a3 = true;
                z2 = false;
            }
        }
        atzn atzn6 = atyx.k;
        if (atzn6 == null) {
            atzn6 = atzn.d;
        }
        if (!adgq.a(atzn6)) {
            a(adfk, a3, true);
            View a4 = adfk.a(R.layout.udc_consent_footer);
            adgq adgq5 = this.c;
            atzn atzn7 = atyx.k;
            if (atzn7 == null) {
                atzn7 = atzn.d;
            }
            adgq5.a(a4, atzn7, this.b);
        }
    }
}
