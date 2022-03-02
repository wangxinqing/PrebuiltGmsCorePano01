package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.smart_profile.header.view.HeaderView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abkz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abkz implements ablg, abgg, abhe, abga {
    private static final anaf g;
    private static final anaf h;
    public final Activity a;
    public final jtf b;
    public final String c;
    public String d;
    public ArrayList e;
    public ArrayList f;
    private final boolean i;
    private final HeaderView j;
    private boolean k;
    private String l;

    static {
        Integer valueOf = Integer.valueOf(R.id.quick_actions_hangout);
        Integer valueOf2 = Integer.valueOf(R.drawable.quantum_ic_hangout_vd_theme_24);
        Integer valueOf3 = Integer.valueOf(R.id.quick_actions_call);
        Integer valueOf4 = Integer.valueOf(R.drawable.quantum_ic_call_vd_theme_24);
        Integer valueOf5 = Integer.valueOf(R.id.quick_actions_email);
        Integer valueOf6 = Integer.valueOf(R.drawable.quantum_ic_email_vd_theme_24);
        Integer num = valueOf3;
        Integer num2 = valueOf5;
        Integer valueOf7 = Integer.valueOf(R.id.quick_actions_schedule);
        g = anaf.a(valueOf, valueOf2, num, valueOf4, num2, valueOf6, valueOf7, Integer.valueOf(R.drawable.quantum_ic_event_vd_theme_24));
        h = anaf.a(valueOf, Integer.valueOf(R.drawable.quantum_gm_ic_videocam_vd_theme_24), num, Integer.valueOf(R.drawable.quantum_gm_ic_call_vd_theme_24), num2, Integer.valueOf(R.drawable.quantum_gm_ic_email_vd_theme_24), valueOf7, Integer.valueOf(R.drawable.quantum_gm_ic_event_vd_theme_24));
    }

    public abkz(Activity activity, HeaderView headerView, String str, jtf jtf, boolean z) {
        this.a = activity;
        this.j = headerView;
        this.c = str;
        this.b = jtf;
        this.i = z;
        this.l = "";
        if (azim.b()) {
            anhj a2 = h.keySet().iterator();
            while (a2.hasNext()) {
                int intValue = ((Integer) a2.next()).intValue();
                a(intValue, uj.b(headerView.getContext(), ((Integer) h.get(Integer.valueOf(intValue))).intValue()));
            }
            return;
        }
        anhj a3 = g.keySet().iterator();
        while (a3.hasNext()) {
            int intValue2 = ((Integer) a3.next()).intValue();
            a(intValue2, uj.b(headerView.getContext(), ((Integer) g.get(Integer.valueOf(intValue2))).intValue()));
            a(intValue2, kf.b(activity, 17170443));
        }
    }

    private final void a(int i2) {
        Button button = (Button) this.j.findViewById(i2);
        button.setEnabled(false);
        if (!azim.b()) {
            button.setAlpha(0.5f);
        } else if (azig.b()) {
            int a2 = jsa.a(button.getContext(), R.attr.quickActionDisabledButtonColor);
            button.setTextColor(a2);
            a(i2, a2);
        } else {
            a(i2, kf.b(button.getContext(), R.color.google_grey400));
        }
    }

    private final void b(int i2, int i3) {
        View findViewById = this.j.findViewById(i2);
        if (findViewById.isEnabled()) {
            qb.b(findViewById, 1);
            findViewById.setContentDescription(this.a.getString(i3, new Object[]{this.l}));
            return;
        }
        qb.b(findViewById, 2);
    }

    private final void a(int i2, int i3) {
        Button button = (Button) this.j.findViewById(i2);
        if (this.j.getResources().getConfiguration().orientation == 2) {
            jpr.a(ry.b(button)[0], i3);
        } else {
            jpr.a(button.getCompoundDrawables()[1], i3);
        }
    }

    public abkz(Activity activity, HeaderView headerView, String str, jtf jtf, boolean z, boolean z2) {
        this(activity, headerView, str, jtf, z);
        if (azim.b() && azhu.c() && z2) {
            headerView.findViewById(R.id.quick_actions_hangout).setVisibility(8);
        }
    }

    private final void a(int i2, Drawable drawable) {
        Button button = (Button) this.j.findViewById(i2);
        if (this.j.getResources().getConfiguration().orientation == 2) {
            ry.a(button, drawable, (Drawable) null);
        } else {
            button.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        }
    }

    private final void a(int i2, View.OnClickListener onClickListener) {
        Button button = (Button) this.j.findViewById(i2);
        button.setEnabled(true);
        button.setOnClickListener(onClickListener);
        if (azim.b()) {
            if (azhl.a.a().f()) {
                int i3 = Build.VERSION.SDK_INT;
                a(i2, jsa.b(button.getContext()));
            } else {
                a(i2, jsa.b(button.getContext()));
            }
            if (azig.b()) {
                int i4 = Build.VERSION.SDK_INT;
                button.setTextColor(jsa.b(button.getContext()));
                return;
            }
            return;
        }
        button.setAlpha(1.0f);
    }

    public final void a(abgh abgh) {
        if (abgh.a()) {
            this.l = abgh.a;
        } else {
            this.l = abgh.c() ? abgh.c : "";
        }
        b(R.id.quick_actions_hangout, R.string.quick_actions_hangout_content_description);
        b(R.id.quick_actions_email, R.string.profile_communicate_email_with_address);
        b(R.id.quick_actions_call, R.string.profile_communicate_call);
        b(R.id.quick_actions_schedule, R.string.quick_actions_schedule_content_description);
    }

    public final void a(abgl abgl) {
        if (abgl.c()) {
            aviq aviq = abgl.d;
            boolean z = true;
            if (!aviq.e) {
                String str = aviq.i;
                this.d = str;
                if (!this.i || TextUtils.isEmpty(str) || TextUtils.isEmpty(this.c)) {
                    a((int) R.id.quick_actions_hangout);
                } else {
                    if (!azim.b() || !azhl.a.a().b()) {
                        z = false;
                    }
                    Intent a2 = abfz.a((Context) this.a, this.d, this.c, z);
                    if (a2 == null || a2.resolveActivity(this.a.getPackageManager()) == null) {
                        a((int) R.id.quick_actions_hangout);
                    } else {
                        a((int) R.id.quick_actions_hangout, (View.OnClickListener) new abkv(this, a2, z));
                    }
                }
            } else {
                this.k = true;
                a((int) R.id.quick_actions_hangout);
                a((int) R.id.quick_actions_email);
                a((int) R.id.quick_actions_call);
                a((int) R.id.quick_actions_schedule);
                return;
            }
        }
        b(R.id.quick_actions_hangout, R.string.quick_actions_hangout_content_description);
    }

    public final void a(List list, List list2, List list3) {
        if (!this.k) {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            int i2 = 0;
            while (true) {
                int i3 = 1;
                if (i2 >= size) {
                    break;
                }
                avhx avhx = (avhx) list.get(i2);
                Bundle bundle = new Bundle();
                if (azim.b()) {
                    bundle.putString("extraValue", avhx.b);
                    bundle.putString("extraFormattedType", avhx.c);
                    Context context = this.j.getContext();
                    int a2 = avhw.a(avhx.d);
                    if (a2 != 0) {
                        i3 = a2;
                    }
                    bundle.putString("extraSourceContext", jqf.a(context, i3));
                } else {
                    bundle.putString("extraValue", avhx.b);
                    bundle.putString("extraFormattedType", avhx.c);
                }
                arrayList.add(bundle);
                i2++;
            }
            this.e = arrayList;
            if (!arrayList.isEmpty()) {
                Intent data = new Intent("android.intent.action.SENDTO").setData(Uri.parse("mailto:"));
                if (data.resolveActivity(this.a.getPackageManager()) != null) {
                    a((int) R.id.quick_actions_email, (View.OnClickListener) new abkw(this, data));
                } else {
                    a((int) R.id.quick_actions_email);
                }
                Intent data2 = new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI);
                if (data2.resolveActivity(this.a.getPackageManager()) != null) {
                    a((int) R.id.quick_actions_schedule, (View.OnClickListener) new abkx(this, data2));
                } else {
                    a((int) R.id.quick_actions_schedule);
                }
            } else {
                a((int) R.id.quick_actions_email);
                a((int) R.id.quick_actions_schedule);
            }
            b(R.id.quick_actions_email, R.string.profile_communicate_email_with_address);
            b(R.id.quick_actions_schedule, R.string.quick_actions_schedule_content_description);
            ArrayList arrayList2 = new ArrayList();
            int size2 = list2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                avhy avhy = (avhy) list2.get(i4);
                Bundle bundle2 = new Bundle();
                if (azim.b()) {
                    bundle2.putString("extraValue", avhy.b);
                    bundle2.putString("extraFormattedType", avhy.c);
                    Context context2 = this.j.getContext();
                    int a3 = avhw.a(avhy.d);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    bundle2.putString("extraSourceContext", jqf.a(context2, a3));
                } else {
                    bundle2.putString("extraValue", avhy.b);
                    bundle2.putString("extraFormattedType", avhy.c);
                }
                arrayList2.add(bundle2);
            }
            this.f = arrayList2;
            Intent intent = new Intent("android.intent.action.DIAL");
            if (arrayList2.isEmpty() || intent.resolveActivity(this.a.getPackageManager()) == null) {
                a((int) R.id.quick_actions_call);
            } else {
                a((int) R.id.quick_actions_call, (View.OnClickListener) new abky(this, intent));
            }
            b(R.id.quick_actions_call, R.string.profile_communicate_call);
        }
    }

    public final void a(boolean z) {
        if (azim.b() && azho.a.a().e() && z) {
            a((int) R.id.quick_actions_hangout);
        }
    }
}
