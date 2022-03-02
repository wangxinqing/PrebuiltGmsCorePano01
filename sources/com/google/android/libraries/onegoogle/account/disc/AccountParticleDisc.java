package com.google.android.libraries.onegoogle.account.disc;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.R;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountParticleDisc extends FrameLayout {
    public final ImageView a;
    public final WeakReference b;
    public final CopyOnWriteArrayList c;
    public final agbc d;
    public agbh e;
    public boolean f;
    public int g;
    public Object h;
    public amri i;
    private final boolean j;
    private final amri k;
    private final boolean l;
    private final int m;
    private final int n;
    private final int o;
    private agck p;
    private int q;
    private agai r;

    public AccountParticleDisc(Context context) {
        this(context, (AttributeSet) null);
    }

    public static void a(Context context, agbv agbv, ExecutorService executorService, agaf agaf, agcm agcm, Class cls) {
        agaz agaz = new agaz(new agan(context, executorService), agaf);
        agch agch = new agch();
        agch.a(new agci[0]);
        agch.d = new agao(agaf);
        if (agcm != null) {
            agch.a = agcm;
            agch.e = new agat();
            agch.b = new agag(agaz);
            agch.a(agci.a);
            String str = agch.d == null ? " keyGenerator" : "";
            if (agch.a == null) {
                str = str.concat(" imageRetriever");
            }
            if (agch.b == null) {
                str = String.valueOf(str).concat(" secondaryImageRetriever");
            }
            if (agch.e == null) {
                str = String.valueOf(str).concat(" defaultImageRetriever");
            }
            if (!str.isEmpty()) {
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
            }
            agbr agbr = new agbr(agch.d, agch.a, agch.b, agch.e, agch.c);
            agck a2 = agar.a(cls);
            Map map = ((agcf) agbv).b.a;
            amrl.a((Object) a2);
            amrl.a((Object) agbr);
            map.put(a2, agbr);
            return;
        }
        throw new NullPointerException("Null imageRetriever");
    }

    private final void d() {
        int i2;
        if (!this.j && !this.f) {
            i2 = 0;
        } else {
            i2 = (int) getResources().getDimension(R.dimen.og_apd_min_padding);
        }
        this.g = i2;
        this.a.setPadding(i2, i2, i2, i2);
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.width = this.q;
        layoutParams.height = this.q;
    }

    private final int e() {
        return b() - this.o;
    }

    public final boolean a() {
        return this.r != null;
    }

    public final int b() {
        int i2 = this.q;
        int i3 = this.g;
        return i2 - (i3 + i3);
    }

    public final void c() {
        ImageView imageView = this.a;
        Context context = imageView.getContext();
        imageView.setImageDrawable(agbp.a(uj.b(context, R.drawable.disc_oval), this.n));
    }

    public AccountParticleDisc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ogAccountParticleDiscStyle);
    }

    /* JADX INFO: finally extract failed */
    public AccountParticleDisc(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        amri amri;
        this.c = new CopyOnWriteArrayList();
        this.d = new agbc(new agah());
        this.i = ampu.a;
        LayoutInflater.from(context).inflate(R.layout.account_particle_disc, this, true);
        this.a = (ImageView) findViewById(R.id.og_apd_internal_image_view);
        this.b = new WeakReference((FrameLayout) findViewById(R.id.badge_wrapper));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, agba.a, i2, 2132017787);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(11, -1);
            this.q = dimensionPixelSize;
            if (dimensionPixelSize == -1) {
                this.q = obtainStyledAttributes.getDimensionPixelSize(10, getResources().getDimensionPixelSize(R.dimen.og_apd_default_max_disc_content_size));
            }
            int i3 = 0;
            this.j = obtainStyledAttributes.getBoolean(0, true);
            this.f = obtainStyledAttributes.getBoolean(1, false);
            this.l = obtainStyledAttributes.getBoolean(9, false);
            this.m = obtainStyledAttributes.getDimensionPixelSize(7, getResources().getDimensionPixelSize(R.dimen.og_apd_default_disc_min_touch_target_size));
            int color = obtainStyledAttributes.getColor(2, -1);
            if (color != -1) {
                amri = amri.b(Integer.valueOf(color));
            } else {
                amri = ampu.a;
            }
            this.k = amri;
            this.n = obtainStyledAttributes.getColor(8, getResources().getColor(R.color.og_default_disc_placeholder_color_light));
            this.o = obtainStyledAttributes.getBoolean(13, true) ? getResources().getDimensionPixelSize(R.dimen.og_apd_amount_to_reduce_avatar_size_when_has_ring) : i3;
            obtainStyledAttributes.recycle();
            c();
            d();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void a(Runnable runnable) {
        if (agzj.a()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    public final void a(agbt agbt) {
        amrl.b(a(), (Object) "initialize must be called first");
        Object obj = this.h;
        if (obj != null) {
            agcg a2 = this.p.a(obj);
            ImageView imageView = this.a;
            agck agck = ((agbq) a2).a;
            agcj a3 = ((agcf) agbt).b.a(agck);
            synchronized (agcf.a) {
                agcf.a.remove(agcf.a(agck, a3, a2, agbu.a(imageView)));
            }
            a((Runnable) new agal(this));
        }
    }

    public final void a(agbv agbv, Class cls) {
        amrl.a((Object) agbv);
        agai agai = new agai(agbv, cls);
        ampu ampu = ampu.a;
        amrl.a((Object) agai);
        this.r = agai;
        this.p = agar.a(cls);
        if (this.l) {
            int i2 = this.m;
            int i3 = this.q;
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int i4 = i2 - i3;
            int max = Math.max(0, ((i4 - paddingLeft) - paddingRight) / 2);
            int max2 = Math.max(0, ((i4 - paddingTop) - paddingBottom) / 2);
            setPadding(getPaddingLeft() + max, getPaddingTop() + max2, getPaddingRight() + max, getPaddingBottom() + max2);
        }
        d();
        if (this.j) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        a((Runnable) new agaj(this, ampu));
        this.a.requestLayout();
        if (this.f) {
            this.e = new agbh((RingView) findViewById(R.id.og_apd_ring_view), e());
        }
    }

    public final void a(Object obj) {
        a((Runnable) new agak(this, obj));
    }

    public final void a(Object obj, ImageView imageView) {
        int i2;
        agzj.b();
        if (!this.i.a()) {
            i2 = this.g;
        } else {
            i2 = 0;
        }
        imageView.setPadding(i2, i2, i2, i2);
        int b2 = !this.i.a() ? b() : e();
        agai agai = this.r;
        agaw agaw = new agaw((byte[]) null);
        amri c2 = amri.c(obj);
        if (c2 != null) {
            agaw.a = c2;
            if (imageView != null) {
                agaw.d = imageView;
                agaw.b = Integer.valueOf(b2);
                amri amri = this.k;
                if (amri != null) {
                    agaw.c = amri;
                    String str = agaw.b == null ? " avatarSize" : "";
                    if (agaw.d == null) {
                        str = str.concat(" imageView");
                    }
                    if (!str.isEmpty()) {
                        String valueOf = String.valueOf(str);
                        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                    }
                    agaq agaq = new agaq(agaw.a, agaw.b.intValue(), agaw.c, agaw.d);
                    agbv agbv = agai.a;
                    agcg a2 = agar.a(agai.b).a(agaq.a.c());
                    ImageView imageView2 = agaq.b;
                    amzy h2 = amzy.h();
                    agzj.b();
                    agcf agcf = (agcf) agbv;
                    agcd agcd = new agcd(agcf, a2, h2, imageView2);
                    agcf.a(imageView2, agcd);
                    Executor executor = agcf.c;
                    agcd.getClass();
                    executor.execute(new agbw(agcd));
                    return;
                }
                throw new NullPointerException("Null borderColor");
            }
            throw new NullPointerException("Null imageView");
        }
        throw new NullPointerException("Null account");
    }
}
