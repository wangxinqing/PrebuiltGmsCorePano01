package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.R;

/* renamed from: accn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class accn extends acco {
    private final accj b;
    private final Context c;
    private int d = 1;
    private String e;

    public accn(Context context, accj accj, FragmentManager fragmentManager, Bundle bundle) {
        super(fragmentManager);
        this.b = accj;
        this.c = context;
        if (bundle != null) {
            this.d = bundle.getInt("state");
            this.e = bundle.getString("deviceName");
            return;
        }
        acdf acdf = new acdf();
        acdf.a = R.drawable.quantum_gm_ic_phone_android_gm_blue_36;
        acdf.b = context.getString(R.string.smartdevice_d2d_target_choice_glif_title);
        acdf.f = true;
        a((Fragment) acdf.a());
    }

    private final Fragment a(String str) {
        String format = String.format(this.c.getString(R.string.smartdevice_d2d_target_google_settings_mnc_description), new Object[]{this.c.getString(R.string.common_set_up_nearby_device_settings_title), str});
        acdf acdf = new acdf();
        acdf.a = R.drawable.quantum_gm_ic_phone_android_gm_blue_36;
        acdf.b = this.c.getString(R.string.smartdevice_d2d_target_choice_glif_title);
        acdf.e = format;
        acdf.b(this.c.getString(R.string.smartdevice_d2d_target_google_settings_link), 1);
        return acdf.a();
    }

    public final int a() {
        return 3;
    }

    public final boolean a(int i) {
        return i == 116 || i == 1;
    }

    public final void b() {
        super.b();
        if (this.d == 2) {
            this.d = 3;
        }
    }

    public final boolean c() {
        return this.d == 2;
    }

    public final void b(int i, Bundle bundle) {
        if (i != 1) {
            if (i == 116) {
                String string = bundle.getString("deviceName");
                this.e = string;
                if (this.d == 1) {
                    b(a(string));
                    this.d = 3;
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder(26);
            sb.append("Invalid action ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        } else if (azky.b()) {
            this.b.b(118, Bundle.EMPTY);
        } else if (this.d == 3) {
            String str = this.e;
            String format = String.format(this.c.getString(R.string.smartdevice_d2d_target_google_settings_description), new Object[]{this.c.getString(R.string.common_set_up_nearby_device_settings_title), jlh.a(str)});
            acdf acdf = new acdf();
            acdf.a = R.drawable.quantum_gm_ic_phone_android_gm_blue_36;
            acdf.b = this.c.getString(R.string.smartdevice_d2d_target_choice_glif_title);
            acdf.e = format;
            acdf.b(this.c.getString(R.string.smartdevice_d2d_target_google_settings_link), 1);
            b(acdf.a());
            this.d = 2;
        } else {
            b();
        }
    }

    public accn(Context context, accj accj, FragmentManager fragmentManager, String str) {
        super(fragmentManager);
        this.c = context;
        this.b = accj;
        this.e = str;
        b(a(str));
    }

    public final void a(Bundle bundle) {
        bundle.putInt("state", this.d);
        bundle.putString("deviceName", this.e);
    }
}
