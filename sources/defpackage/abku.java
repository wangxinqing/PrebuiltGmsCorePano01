package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.smart_profile.header.view.HeaderView;

/* renamed from: abku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abku implements abgg, abfe, ablg, abga {
    public final HeaderView a;
    private final jtf b;
    private boolean c;
    private boolean d;
    private String e;

    public abku(HeaderView headerView, jtf jtf) {
        this.a = headerView;
        this.b = jtf;
        jtf.b(jth.SMART_PROFILE_HEADER, new jth[0]);
    }

    private final void a() {
        if (TextUtils.isEmpty(this.e)) {
            return;
        }
        if (this.c) {
            HeaderView headerView = this.a;
            String str = this.e;
            headerView.a(headerView.getContext().getString(R.string.header_self_view_display_name, new Object[]{str}));
            this.b.b(jth.YOU_LABEL, jth.SMART_PROFILE_HEADER);
            return;
        }
        this.a.a(this.e);
    }

    public final void a(abgh abgh) {
        if (abgh.a()) {
            this.e = abgh.a;
            a();
        } else if (abgh.c()) {
            this.e = abgh.c;
            a();
        }
    }

    public final void a(abgl abgl) {
        boolean z;
        if (abgl.c()) {
            aviq aviq = abgl.d;
            int i = 0;
            if (aviq.e) {
                this.d = true;
                HeaderView headerView = this.a;
                jpr.a(headerView.d.findViewById(R.id.profile_header_blocked_avatar_icon));
                if (headerView.j) {
                    jpr.b((View) headerView.a);
                    headerView.j = false;
                } else {
                    jpr.b((View) headerView.b);
                }
                this.a.d();
            } else if (azim.b()) {
                HeaderView headerView2 = this.a;
                String str = aviq.f;
                String str2 = aviq.g;
                String str3 = aviq.h;
                if (!TextUtils.isEmpty(str)) {
                    ((TextView) headerView2.d.findViewById(R.id.job_title)).setText(str);
                    jpr.a(headerView2.findViewById(R.id.job_title));
                }
                if (!TextUtils.isEmpty(str2)) {
                    ((TextView) headerView2.d.findViewById(R.id.department)).setText(str2);
                    jpr.a(headerView2.findViewById(R.id.department));
                }
                if (!TextUtils.isEmpty(str3)) {
                    ((TextView) headerView2.d.findViewById(R.id.organization)).setText(str3);
                    jpr.a(headerView2.findViewById(R.id.organization));
                }
                anhk i2 = (headerView2.f ? amzy.a(Integer.valueOf(R.id.job_title), Integer.valueOf(R.id.department), Integer.valueOf(R.id.organization)) : amzy.a((Object) Integer.valueOf(R.id.department), (Object) Integer.valueOf(R.id.organization))).listIterator();
                while (true) {
                    if (!i2.hasNext()) {
                        break;
                    }
                    TextView textView = (TextView) headerView2.d.findViewById(((Integer) i2.next()).intValue());
                    if (textView.getVisibility() == 0) {
                        Drawable[] b2 = ry.b(textView);
                        ry.a(textView, (Drawable) null, b2[1], b2[2], b2[3]);
                        break;
                    }
                }
            } else {
                HeaderView headerView3 = this.a;
                String str4 = aviq.f;
                String str5 = aviq.g;
                String str6 = aviq.h;
                String str7 = aviq.c;
                if (!TextUtils.isEmpty(str4)) {
                    headerView3.a(R.id.job_title, str4);
                    z = true;
                } else {
                    z = false;
                }
                if (!TextUtils.isEmpty(str5)) {
                    headerView3.a(R.id.department, str5);
                    z = true;
                }
                if (!TextUtils.isEmpty(str6)) {
                    headerView3.a(R.id.organization, str6);
                    z = true;
                }
                if (!TextUtils.isEmpty(str7)) {
                    headerView3.a(R.id.domain_name, str7);
                    z = true;
                }
                int[] iArr = headerView3.f ? new int[]{R.id.job_title, R.id.department, R.id.organization, R.id.domain_name} : new int[]{R.id.department, R.id.organization, R.id.domain_name};
                int length = iArr.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    TextView textView2 = (TextView) headerView3.d.findViewById(iArr[i]);
                    if (textView2.getVisibility() == 0) {
                        Drawable[] b3 = ry.b(textView2);
                        ry.a(textView2, (Drawable) null, b3[1], b3[2], b3[3]);
                        break;
                    }
                    i++;
                }
                if (z) {
                    jpr.a(headerView3.findViewById(R.id.about_container));
                }
            }
            if (!aviq.c.isEmpty()) {
                HeaderView headerView4 = this.a;
                headerView4.k = true;
                int i3 = Build.VERSION.SDK_INT;
                jpr.a((View) (ImageView) headerView4.findViewById(R.id.domain_icon));
            }
        }
    }

    public final void a(Bitmap bitmap) {
        if (!this.d) {
            Bitmap a2 = iqw.a(bitmap);
            HeaderView headerView = this.a;
            headerView.a.setImageDrawable(new BitmapDrawable(headerView.getResources(), a2));
            if (!headerView.j) {
                jpr.a((View) headerView.a);
                jpr.b((View) headerView.b);
            }
            headerView.j = true;
        }
    }

    public final void a(boolean z) {
        this.c = z;
        a();
    }
}
