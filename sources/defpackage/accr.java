package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.smartdevice.d2d.ui.DeviceListItemView;
import java.util.Locale;

/* renamed from: accr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class accr extends acco {
    public final accj b;
    public final acac c;
    public String d;
    private final Context e;
    private int f = 2;
    private acck g;

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, accj] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public accr(android.content.Context r2, com.google.android.chimera.FragmentManager r3, android.os.Bundle r4, defpackage.acac r5) {
        /*
            r1 = this;
            r1.<init>(r3)
            r1.e = r2
            r1.b = r2
            r1.c = r5
            r3 = 2
            r1.f = r3
            if (r4 != 0) goto L_0x0057
            acdf r4 = new acdf
            r4.<init>()
            r5 = 2131231791(0x7f08042f, float:1.8079673E38)
            r4.a = r5
            r5 = 2131954046(0x7f13097e, float:1.954458E38)
            java.lang.String r5 = r2.getString(r5)
            r4.b = r5
            r5 = 2131232104(0x7f080568, float:1.8080308E38)
            r0 = 1
            r4.a((int) r5, (boolean) r0)
            r5 = 2131952264(0x7f130288, float:1.9540966E38)
            java.lang.String r5 = r2.getString(r5)
            r4.a((java.lang.String) r5, (int) r0)
            boolean r5 = defpackage.azmd.b()
            if (r5 == 0) goto L_0x0045
            r3 = 2131954047(0x7f13097f, float:1.9544582E38)
            java.lang.String r2 = r2.getString(r3)
            r3 = 118(0x76, float:1.65E-43)
            r4.b(r2, r3)
            goto L_0x004f
        L_0x0045:
            r5 = 2131954045(0x7f13097d, float:1.9544578E38)
            java.lang.String r2 = r2.getString(r5)
            r4.b(r2, r3)
        L_0x004f:
            acdg r2 = r4.a()
            r1.a((com.google.android.chimera.Fragment) r2)
            return
        L_0x0057:
            java.lang.String r2 = "nextFragment"
            int r2 = r4.getInt(r2)
            r1.f = r2
            java.lang.String r2 = "deviceName"
            java.lang.String r2 = r4.getString(r2)
            r1.d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.accr.<init>(android.content.Context, com.google.android.chimera.FragmentManager, android.os.Bundle, acac):void");
    }

    private static final CharSequence a(Context context) {
        mq a = mp.a(context.getResources().getConfiguration());
        Locale locale = a.a() <= 0 ? Locale.getDefault() : a.c();
        if (!azlf.a.a().Y() || !"pt".equals(locale.getLanguage())) {
            return context.getString(R.string.smartdevice_setup_google_app_trigger);
        }
        return context.getString(R.string.smartdevice_pt_google_app_trigger);
    }

    public final int a() {
        return 2;
    }

    public final boolean a(int i) {
        return i == 1 || i == 2 || i == 3 || i == 116;
    }

    public final void b() {
        super.b();
        this.f--;
    }

    public final void b(int i, Bundle bundle) {
        if (i == 1) {
            int i2 = this.f;
            if (i2 == 2) {
                Context context = this.e;
                String charSequence = TextUtils.expandTemplate(context.getString(R.string.smartdevice_target_hotphrase_instructions), new CharSequence[]{context.getString(R.string.smartdevice_ok_google), a(context)}).toString();
                acdf acdf = new acdf();
                acdf.a = R.drawable.quantum_gm_ic_compare_arrows_gm_blue_36;
                acdf.b = context.getString(R.string.smartdevice_d2d_target_title);
                acdf.c = charSequence;
                acdf.d = true;
                acdf.a((int) R.drawable.smartdevice_in_google_app, true);
                acdf.a(context.getString(R.string.common_next), 1);
                if (azmd.b()) {
                    acdf.b(context.getString(R.string.smartdevice_d2d_target_instruction_copy_another_way), 118);
                } else {
                    acdf.b(context.getString(R.string.smartdevice_d2d_target_help_text), 3);
                }
                b(acdf.a());
            } else if (i2 == 3) {
                String b2 = amrk.b(this.d);
                Bundle bundle2 = new Bundle();
                bundle2.putString("deviceName", b2);
                acck acck = new acck();
                acck.setArguments(bundle2);
                this.g = acck;
                b(acck);
            } else {
                StringBuilder sb = new StringBuilder(33);
                sb.append("Invalid next fragment ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
            }
            this.f++;
        } else if (i == 2) {
            DisplayMetrics displayMetrics = this.e.getResources().getDisplayMetrics();
            int applyDimension = (int) TypedValue.applyDimension(1, 48.0f, displayMetrics);
            Drawable a = kf.a(this.e, (int) R.drawable.product_logo_gsa_shadow_color_48);
            a.setBounds(0, 0, applyDimension, applyDimension);
            ImageSpan imageSpan = new ImageSpan(a);
            SpannableString spannableString = new SpannableString(String.valueOf(this.e.getString(R.string.smartdevice_d2d_target_other_device_description)).concat("\n "));
            spannableString.setSpan(imageSpan, spannableString.length() - 1, spannableString.length(), 33);
            sr a2 = aceg.a(this.e);
            a2.a((CharSequence) spannableString);
            a2.b((int) R.string.common_got_it, (DialogInterface.OnClickListener) new accp());
            TextView textView = (TextView) a2.c().findViewById(16908299);
            if (textView != null) {
                textView.setLineSpacing((float) (((int) TypedValue.applyDimension(1, 24.0f, displayMetrics)) - textView.getLineHeight()), 1.0f);
            }
            aucd aucd = this.c.c;
            int i3 = ((anpa) aucd.b).p + 1;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            anpa anpa = (anpa) aucd.b;
            anpa anpa2 = anpa.u;
            anpa.a |= 65536;
            anpa.p = i3;
        } else if (i == 3) {
            if (azky.b()) {
                this.b.b(117, new Bundle());
            } else {
                Spanned fromHtml = Html.fromHtml(TextUtils.expandTemplate(this.e.getString(R.string.smartdevice_type_typing_ok_google), new CharSequence[]{a(this.e)}).toString());
                sr a3 = aceg.a(this.e);
                a3.a((CharSequence) fromHtml);
                a3.b((int) R.string.common_got_it, (DialogInterface.OnClickListener) null);
                a3.a((int) R.string.smartdevice_action_try_another_way, (DialogInterface.OnClickListener) new accq(this));
                a3.c();
            }
            aucd aucd2 = this.c.c;
            int i4 = ((anpa) aucd2.b).q + 1;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            anpa anpa3 = (anpa) aucd2.b;
            anpa anpa4 = anpa.u;
            anpa3.a |= 131072;
            anpa3.q = i4;
        } else if (i == 116) {
            String string = bundle.getString("deviceName");
            this.d = string;
            acck acck2 = this.g;
            if (acck2 != null) {
                acck2.a = string;
                DeviceListItemView deviceListItemView = acck2.b;
                if (deviceListItemView != null) {
                    deviceListItemView.a(string);
                }
            }
        } else {
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("Unknown action ");
            sb2.append(i);
            throw new IllegalStateException(sb2.toString());
        }
    }

    public final void a(Bundle bundle) {
        bundle.putInt("nextFragment", this.f);
        bundle.putString("deviceName", this.d);
    }
}
