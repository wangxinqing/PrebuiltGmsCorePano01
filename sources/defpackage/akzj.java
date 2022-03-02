package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.places.ui.TouchableMapView;

/* renamed from: akzj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akzj extends Fragment implements View.OnTouchListener, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, rqk, rqm, rql, alah {
    private boolean A;
    /* access modifiers changed from: private */
    public boolean B;
    public final ou a = new ou();
    public boolean b;
    public ruv c;
    public akyr d;
    public TouchableMapView e;
    public rqn f;
    public View g;
    public View h;
    public ImageView i;
    public View j;
    public rvg k;
    public rvb l;
    public Point m;
    public int n;
    public int o;
    public ruv p;
    public Drawable q;
    public int r;
    public int s;
    public akzh t;
    public boolean u;
    public boolean v = true;
    public boolean w = false;
    private View x;
    private pc y;
    private akzi z;

    private final void j() {
        akzh akzh = this.t;
        if (akzh != null) {
            albv albv = (albv) akzh;
            if (!albv.d) {
                akzj akzj = albv.c;
                if (!akzj.A) {
                    akzj.A = true;
                    if (akzj.j != null) {
                        akzj.j.startAnimation(AnimationUtils.loadAnimation(akzj.getActivity(), R.anim.slide_right));
                        akzj.j.setVisibility(8);
                    }
                    View view = akzj.x;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    if (akzj.g.getVisibility() == 0) {
                        Animation loadAnimation = AnimationUtils.loadAnimation(akzj.getActivity(), R.anim.slide_up);
                        loadAnimation.setFillAfter(true);
                        akzj.g.startAnimation(loadAnimation);
                        akzj.h.setVisibility(0);
                        int i2 = Build.VERSION.SDK_INT;
                        akzj.g.setAlpha(0.6f);
                        akzj.i.setVisibility(8);
                    }
                }
                albv.d = true;
            }
        }
        this.b = true;
    }

    public final void b() {
        akzh akzh;
        if (!this.u && (akzh = this.t) != null) {
            albv albv = (albv) akzh;
            albv.i = null;
            if (!albv.e) {
                albv.c();
            }
        }
    }

    public final LatLng c() {
        rqn rqn;
        if (this.m == null || (rqn = this.f) == null) {
            return null;
        }
        return rqn.e().a(this.m);
    }

    public final LatLngBounds d() {
        Location c2;
        rqn rqn = this.f;
        if (rqn == null) {
            return new LatLngBounds(new LatLng(-90.0d, -180.0d), new LatLng(90.0d, 180.0d));
        }
        if ((!this.B || this.u) && this.v && (c2 = rqn.c()) != null) {
            return new LatLngBounds(new LatLng(c2.getLatitude() - 440.32d, c2.getLongitude() - 440.32d), new LatLng(c2.getLatitude() + 0.01d, c2.getLongitude() + 0.01d));
        }
        rqt e2 = this.f.e();
        Point point = new Point(this.n, 0);
        Point point2 = new Point(0, this.o);
        return new LatLngBounds(e2.a(point2), e2.a(point));
    }

    public final CameraPosition e() {
        rqn rqn = this.f;
        if (rqn != null) {
            return rqn.a();
        }
        return null;
    }

    public final void f() {
        if (this.u) {
            b(true);
            View view = this.j;
            if (view != null) {
                view.setVisibility(0);
            }
            getView().setVisibility(0);
            this.u = false;
        }
    }

    public final void g() {
        rvg rvg = this.k;
        if (rvg != null) {
            rvg.a();
            this.k = null;
        }
        rvb rvb = this.l;
        if (rvb != null) {
            rvb.a();
            this.l = null;
        }
    }

    public final void h() {
        ((FrameLayout.LayoutParams) this.j.getLayoutParams()).setMargins(0, 0, alan.a(8.0f, (Context) getActivity()), alan.a(8.0f, (Context) getActivity()));
    }

    public final void i() {
        if (this.p != null && c() != null) {
            LatLng c2 = c();
            double d2 = (double) this.s;
            Double.isNaN(d2);
            double degrees = Math.toDegrees(d2 / 6371010.0d) / 2.0d;
            double d3 = (double) this.r;
            Double.isNaN(d3);
            double degrees2 = Math.toDegrees(d3 / (Math.cos(Math.toRadians(c2.a)) * 6371010.0d)) / 2.0d;
            LatLng latLng = new LatLng(c2.a + degrees, c2.b - degrees2);
            LatLng latLng2 = new LatLng(c2.a - degrees, c2.b + degrees2);
            Point a2 = this.f.e().a(latLng);
            Point a3 = this.f.e().a(latLng2);
            ((FrameLayout.LayoutParams) this.i.getLayoutParams()).width = a3.x - a2.x;
            ((FrameLayout.LayoutParams) this.i.getLayoutParams()).height = a3.y - a2.y;
            this.i.requestLayout();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        pc pcVar = new pc(getActivity(), this);
        this.y = pcVar;
        pcVar.a.a.setOnDoubleTapListener(this);
        this.j.setOnTouchListener(new akzb(this));
        this.e.a(bundle);
        TouchableMapView touchableMapView = this.e;
        touchableMapView.a = this;
        touchableMapView.a((rqs) new akzc(this));
        View findViewById = this.e.findViewById(3);
        this.x = findViewById;
        if (findViewById != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, alan.a(48.0f, (Context) getActivity()));
        }
        akzi akzi = this.z;
        if (akzi != null) {
            akzi.a();
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        rqr.a(getActivity());
        try {
            this.z = (akzi) activity;
        } catch (ClassCastException e2) {
            Log.w("Places", String.valueOf(activity.toString()).concat(" does not implement ViewCompleteListener and will not be informed when this fragment's view is ready."));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.places_ui_marker_map, viewGroup, false);
        this.e = (TouchableMapView) inflate.findViewById(R.id.marker_map);
        this.i = (ImageView) inflate.findViewById(R.id.marker_map_center_overlay);
        View findViewById = inflate.findViewById(R.id.marker_map_my_location_button);
        this.j = findViewById;
        findViewById.setOnClickListener(new akza(this));
        this.g = inflate.findViewById(R.id.marker_map_center_drop);
        this.h = inflate.findViewById(R.id.marker_map_center_cross);
        this.c = ruw.a();
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f = null;
        this.e.c();
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        j();
        return false;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        j();
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        j();
    }

    public final void onLowMemory() {
        super.onLowMemory();
        this.e.d();
    }

    public final void onPause() {
        super.onPause();
        this.e.b();
    }

    public final void onResume() {
        super.onResume();
        this.e.a();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.e.b(bundle);
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        j();
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        akzh akzh;
        if (this.u) {
            return true;
        }
        this.y.a(motionEvent);
        if (motionEvent.getAction() == 1 && (akzh = this.t) != null) {
            albv albv = (albv) akzh;
            if (albv.d) {
                akzj akzj = albv.c;
                if (akzj.A) {
                    if (akzj.j != null) {
                        akzj.j.startAnimation(AnimationUtils.loadAnimation(akzj.getActivity(), R.anim.slide_left));
                        akzj.j.setVisibility(0);
                    }
                    akzj.x.setVisibility(0);
                    if (akzj.g.getVisibility() == 0) {
                        akzj.g.startAnimation(AnimationUtils.loadAnimation(akzj.getActivity(), R.anim.slide_down));
                        akzj.h.setVisibility(8);
                        int i2 = Build.VERSION.SDK_INT;
                        akzj.g.setAlpha(1.0f);
                        akzj.i();
                        akzj.i.setVisibility(0);
                    }
                    akzj.A = false;
                }
                albv.d = false;
            }
        }
        return false;
    }

    public static final void a(rqn rqn, CameraPosition cameraPosition) {
        try {
            rqn.a(new rqh(rqi.a().a(cameraPosition)));
        } catch (RemoteException e2) {
            throw new rvl(e2);
        }
    }

    public final void c(boolean z2) {
        this.e.a((rqs) new akyy(this, z2));
    }

    public final void b(boolean z2) {
        this.e.a((rqs) new akyu(z2));
    }

    public final void a() {
        akzh akzh = this.t;
        if (akzh != null) {
            albv albv = (albv) akzh;
            if (!albv.e && albv.i == null) {
                CameraPosition e2 = albv.c.e();
                if (!ius.a(albv.h, e2)) {
                    albv.h = e2;
                    albv.c();
                }
            }
        }
    }

    public final void a(LatLng latLng) {
        this.e.a((rqs) new akzf(this, latLng));
    }

    public final void a(rhq rhq) {
        this.e.a((rqs) new akyv(this, rhq));
    }

    public final void a(boolean z2) {
        if (z2) {
            g();
            this.g.setVisibility(0);
            i();
            if (!this.A && this.p != null) {
                this.i.setVisibility(0);
                return;
            }
            return;
        }
        this.g.setVisibility(8);
        this.h.setVisibility(8);
        this.i.setVisibility(8);
    }

    public final boolean a(rvg rvg) {
        rhq rhq = (rhq) this.a.get(rvg.b());
        if (rhq != null) {
            a(false);
            a(rhq);
            akzh akzh = this.t;
            if (akzh != null) {
                albv albv = (albv) akzh;
                albv.i = rhq;
                albv.a(rhq);
            }
        }
        return true;
    }
}
