package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.Fragment;
import com.google.android.gms.maps.MapView;

/* renamed from: aldl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aldl extends Fragment {
    private MapView a;
    private boolean b = false;
    private boolean c = false;
    private Bundle d = null;

    public final void a(MapView mapView) {
        MapView mapView2 = this.a;
        if (mapView2 != null) {
            if (this.c) {
                mapView2.b();
            }
            if (this.b) {
                this.a.c();
            }
        }
        this.a = mapView;
        if (mapView != null) {
            if (this.b) {
                try {
                    mapView.a(this.d);
                } catch (NullPointerException e) {
                    Log.wtf("Places", "MapView threw NPE. This should only happen in tests.", e);
                }
            }
            if (this.c) {
                this.a.a();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.b = true;
        if (bundle != null) {
            bundle2 = bundle.getBundle("MapViewBundleKey");
        } else {
            bundle2 = null;
        }
        this.d = bundle2;
        MapView mapView = this.a;
        if (mapView != null) {
            try {
                mapView.a(bundle2);
            } catch (NullPointerException e) {
            }
        }
    }

    public final void onDestroy() {
        this.b = false;
        MapView mapView = this.a;
        if (mapView != null) {
            mapView.c();
        }
        super.onDestroy();
    }

    public final void onPause() {
        this.c = false;
        MapView mapView = this.a;
        if (mapView != null) {
            mapView.b();
        }
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        this.c = true;
        MapView mapView = this.a;
        if (mapView != null) {
            mapView.a();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.a != null) {
            Bundle bundle2 = bundle.getBundle("MapViewBundleKey");
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle("MapViewBundleKey", bundle2);
            }
            this.a.b(bundle2);
        }
    }
}
