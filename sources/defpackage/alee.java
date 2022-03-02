package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.google.android.gms.R;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* renamed from: alee  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alee extends FrameLayout implements alen, aldk, rqp {
    public final aleo a;
    public final aldv b;
    public final MapView c;
    public rqn d;
    public rvb e;
    public ruv f;
    public int g;
    public int h;
    public final ArrayList i = new ArrayList();
    public rqj j;
    private final aldl k;
    private final Animation l;
    private final Animation m;
    private final View n;
    private int o;
    private boolean p;
    private final Rect q = new Rect();
    private final Rect r = new Rect();

    public alee(Context context, aleo aleo, aldl aldl) {
        super(context);
        this.a = aleo;
        this.k = aldl;
        this.b = new aldv(this.a, this, akyr.a(getContext()));
        this.l = AnimationUtils.loadAnimation(context, R.anim.place_picker_show_search_bar);
        this.m = AnimationUtils.loadAnimation(context, R.anim.place_picker_hide_search_bar);
        LayoutInflater.from(context).inflate(R.layout.place_picker_marker_map, this);
        View findViewById = findViewById(R.id.search_bar);
        this.n = findViewById;
        findViewById.setOnClickListener(new aldw(this));
        findViewById(R.id.my_location_button).setOnClickListener(new aldx(this));
        findViewById(R.id.select_marker_location).setOnClickListener(new aldy(this));
        MapView mapView = (MapView) findViewById(R.id.map);
        this.c = mapView;
        this.k.a(mapView);
        this.c.a((rqs) new aldz(this));
        this.o = 0;
        this.a.a((alen) this);
    }

    public final void a() {
        if (this.d != null) {
            ArrayList arrayList = this.i;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((rvg) arrayList.get(i2)).a();
            }
            this.i.clear();
        }
    }

    public final void b(boolean z) {
        if (this.d != null) {
            if (this.e == null) {
                if (this.f != null) {
                    GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions();
                    groundOverlayOptions.a(this.f);
                    groundOverlayOptions.a(new LatLng(0.0d, 0.0d), (float) this.g, (float) this.h);
                    groundOverlayOptions.a(0.6f);
                    groundOverlayOptions.g = false;
                    this.e = this.d.a(groundOverlayOptions);
                } else {
                    return;
                }
            }
            if (z) {
                try {
                    this.e.a.a(this.d.a().a);
                    this.e.a(true);
                } catch (RemoteException e2) {
                    throw new rvl(e2);
                }
            } else {
                this.e.a(false);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean fitSystemWindows(Rect rect) {
        int i2 = rect.top;
        int i3 = this.o;
        this.o = rect.top;
        ((FrameLayout.LayoutParams) this.n.getLayoutParams()).topMargin += i2 - i3;
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        View findViewById = findViewById(R.id.selected_location_marker);
        this.q.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        this.r.set(this.n.getLeft(), this.n.getTop(), this.n.getRight(), this.n.getBottom());
        this.q.offset(0, -findViewById.getHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (!this.q.intersect(this.r) || i6 != 2) {
            this.p = false;
            return;
        }
        this.p = true;
        a(false);
    }

    public final void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public final void a(LatLng latLng, boolean z) {
        if (this.d != null) {
            rqh a2 = rqi.a(latLng);
            if (z) {
                this.d.b(a2);
            } else {
                this.d.a(a2);
            }
        }
    }

    public final void a(boolean z) {
        if (!this.p && z) {
            alex.a(this.l, this.n, 0);
        } else {
            alex.a(this.m, this.n, 4);
        }
    }
}
