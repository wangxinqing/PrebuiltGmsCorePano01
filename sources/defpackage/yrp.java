package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.common.ui.widget.MultiLineLayout;
import java.util.LinkedHashMap;

/* renamed from: yrp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yrp extends FrameLayout implements View.OnClickListener {
    public final TextView a;
    public final iqj b = new iqj(2097152);
    public boolean c;
    public Audience d;
    public int e;
    public boolean f;
    private final LayoutInflater g;
    private final MultiLineLayout h;
    private final View i;
    private final LinkedHashMap j = new LinkedHashMap();
    private String k;
    private final iim l;
    private int m;
    private final String n;
    private final Context o;
    private final icc p;

    public yrp(Context context, Context context2, iim iim) {
        super(context);
        this.l = iim;
        this.o = context2;
        LayoutInflater from = LayoutInflater.from(context2);
        this.g = from;
        View inflate = from.inflate(R.layout.common_audience_view, this);
        this.h = (MultiLineLayout) inflate.findViewById(R.id.audience_view_list);
        this.i = inflate.findViewById(R.id.audience_view_editable);
        this.a = (TextView) inflate.findViewById(R.id.audience_view_text);
        this.n = context2.getString(R.string.plus_sharebox_audience_view_name_separator);
        ibz ibz = new ibz(context);
        ibq ibq = wlt.a;
        wlr wlr = new wlr();
        wlr.a = 80;
        ibz.a(ibq, (ibj) wlr.a());
        this.p = ibz.b();
        setOnClickListener(this);
        this.i.setOnClickListener(this);
        setSaveEnabled(true);
    }

    public static final void a(Bitmap bitmap, ImageView imageView) {
        imageView.setAlpha(255);
        imageView.setImageBitmap(bitmap);
        imageView.setPadding(0, 0, 0, 0);
    }

    public final void b() {
        for (View view : this.j.values()) {
            a(view, (AudienceMember) view.getTag());
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.p.e();
    }

    public void onClick(View view) {
        try {
            int i2 = this.m;
            if (i2 == 2) {
                this.l.a((AudienceMember) view.getTag());
            } else if (i2 == 3) {
                this.l.b();
            }
        } catch (RemoteException e2) {
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.p.g();
        super.onDetachedFromWindow();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        bundle.setClassLoader(getClass().getClassLoader());
        super.onRestoreInstanceState(bundle.getParcelable("parent"));
        this.c = bundle.getBoolean("showEmptyText", false);
        this.f = bundle.getBoolean("underage", false);
        a((Audience) bundle.getParcelable("audience"));
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parent", super.onSaveInstanceState());
        bundle.putBoolean("showEmptyText", this.c);
        bundle.putBoolean("underage", this.f);
        bundle.putParcelable("audience", this.d);
        return bundle;
    }

    private final void a(View view, AudienceMember audienceMember) {
        boolean z;
        yrp yrp;
        String str;
        String str2;
        View findViewById = view.findViewById(R.id.chip_background);
        TextView textView = (TextView) view.findViewById(R.id.chip_text);
        ImageView imageView = (ImageView) view.findViewById(R.id.chip_icon);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.chip_close);
        int i2 = 0;
        if (audienceMember == null) {
            z = false;
        } else if (!audienceMember.h.getBoolean("checkboxEnabled", true) || this.m != 2) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            i2 = 8;
        }
        imageView2.setVisibility(i2);
        if (!z) {
            yrp = null;
        } else {
            yrp = this;
        }
        view.setOnClickListener(yrp);
        view.setClickable(z);
        view.setTag(audienceMember);
        Context context = this.o;
        boolean z2 = this.f;
        int i3 = audienceMember.b;
        int i4 = R.drawable.common_ic_acl_circles;
        int i5 = R.drawable.common_acl_chip_green;
        if (i3 == 1) {
            int i6 = audienceMember.c;
            if (i6 == -1) {
                str = audienceMember.f;
            } else if (i6 == 1) {
                if (z2) {
                    i5 = R.drawable.common_acl_chip_red;
                }
                str = context.getString(R.string.common_chips_label_public);
                i4 = R.drawable.common_ic_acl_public;
            } else if (i6 == 2) {
                str = audienceMember.f;
                i4 = R.drawable.common_ic_acl_domain;
            } else if (i6 == 3) {
                str = context.getString(R.string.common_chips_label_your_circles);
            } else if (i6 == 4) {
                if (z2) {
                    i5 = R.drawable.common_acl_chip_red;
                }
                str = context.getString(R.string.common_chips_label_extended_circles);
                i4 = R.drawable.common_ic_acl_extended;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Unknown circle type: ");
                sb.append(i6);
                throw new IllegalArgumentException(sb.toString());
            }
            i5 = R.drawable.common_acl_chip_blue;
        } else if (i3 == 2) {
            str = audienceMember.f;
            i4 = R.drawable.common_ic_acl_person;
            i5 = R.drawable.common_acl_chip_blue;
        } else {
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Unknown audience member type: ");
            sb2.append(i3);
            throw new IllegalArgumentException(sb2.toString());
        }
        yrq yrq = new yrq(i5, str, i4);
        findViewById.setBackgroundResource(yrq.a);
        textView.setText(yrq.b);
        imageView.setAlpha(127);
        imageView.setImageResource(yrq.c);
        if (audienceMember.c() && (str2 = audienceMember.g) != null) {
            Bitmap bitmap = (Bitmap) this.b.a((Object) str2);
            if (bitmap != null) {
                a(bitmap, imageView);
            }
            ibq ibq = wlt.a;
            xdh.a(this.p, str2, 1, 1).a((icm) new yrn(this, str2, imageView));
        }
    }

    public final void a() {
        Audience audience = this.d;
        if (audience != null && audience.e) {
            this.m = 1;
            this.a.setVisibility(0);
            this.h.setVisibility(8);
        } else {
            this.m = this.e;
            this.a.setVisibility(8);
            this.h.setVisibility(0);
        }
        int i2 = this.m;
        if (i2 == 1) {
            this.i.setVisibility(8);
            setClickable(false);
            setOnClickListener((View.OnClickListener) null);
        } else if (i2 == 2) {
            this.i.setVisibility(8);
            setClickable(false);
            setOnClickListener((View.OnClickListener) null);
        } else if (i2 == 3) {
            this.i.setVisibility(0);
            setClickable(true);
            setOnClickListener(this);
        }
        b();
        invalidate();
    }

    public final void a(Audience audience) {
        this.d = audience;
        this.j.clear();
        this.h.removeAllViews();
        this.k = "";
        if (audience != null && audience.b.size() > 0) {
            for (AudienceMember audienceMember : audience.b) {
                if (audienceMember == null) {
                    throw new IllegalArgumentException("AudienceMember can not be null.");
                } else if (!this.j.containsKey(audienceMember)) {
                    if (this.c && this.j.isEmpty()) {
                        this.k = audienceMember.f;
                        this.h.removeAllViews();
                    } else {
                        String valueOf = String.valueOf(this.k);
                        String str = this.n;
                        String str2 = audienceMember.f;
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(str).length() + String.valueOf(str2).length());
                        sb.append(valueOf);
                        sb.append(str);
                        sb.append(str2);
                        this.k = sb.toString();
                    }
                    View inflate = this.g.inflate(R.layout.common_audience_view_chip, (ViewGroup) null);
                    a(inflate, audienceMember);
                    this.j.put(audienceMember, inflate);
                    this.h.addView(inflate);
                    this.a.setText(this.k);
                    invalidate();
                }
            }
        } else if (this.c) {
            this.a.setText(R.string.common_chips_label_empty_circles);
        }
        a();
    }
}
