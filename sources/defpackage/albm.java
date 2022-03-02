package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.places.ui.TouchableMapView;

/* renamed from: albm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class albm extends Fragment {
    public albl a;
    public TextView b;
    public MapView c;
    public boolean d;
    public String e;
    private MenuItem f;
    private AlertDialog g;

    public final void a(CharSequence charSequence, LatLng latLng, Bitmap bitmap, float f2, float f3, rqh rqh, rqn rqn) {
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(charSequence);
        }
        rqn.b();
        if (bitmap != null) {
            GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions();
            groundOverlayOptions.a(0.4f);
            groundOverlayOptions.a(latLng, f2, f3);
            groundOverlayOptions.a(ruw.a(bitmap));
            rqn.a(groundOverlayOptions);
        }
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.a(latLng);
        markerOptions.d = ruw.a();
        rqn.a(markerOptions);
        rqn.a(rqh);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        akyp.a(getActivity(), getArguments().getInt("primary_color"), getArguments().getInt("primary_color_dark"), getArguments().getInt("text_color"));
    }

    public final void onCreate(Bundle bundle) {
        setRetainInstance(true);
        super.onCreate(bundle);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.alias_editor_menu_map, menu);
        MenuItem findItem = menu.findItem(R.id.alias_editor_menu_delete);
        this.f = findItem;
        if (findItem != null) {
            Activity activity = getActivity();
            MenuItem menuItem = this.f;
            int i = getArguments().getInt("text_color");
            if (akyp.a(activity) != null) {
                Drawable drawable = activity.getResources().getDrawable(R.drawable.ic_delete);
                akyp.a(drawable, i);
                menuItem.setIcon(drawable);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CharSequence charSequence;
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(R.layout.alias_editor_fragment, viewGroup, false);
        this.b = (TextView) inflate.findViewById(R.id.address_field);
        TouchableMapView touchableMapView = (TouchableMapView) inflate.findViewById(R.id.map);
        this.c = touchableMapView;
        touchableMapView.a((rqs) new albe(this));
        if (getArguments() != null) {
            CharSequence charSequence2 = getArguments().getCharSequence("alias_name");
            this.e = charSequence2 == null ? "" : charSequence2.toString();
        }
        if (!(bundle == null || (charSequence = bundle.getCharSequence("alias_address")) == null)) {
            this.b.setText(charSequence);
        }
        this.b.setOnClickListener(new albf(this));
        this.c.a(bundle);
        sg aE = ((bjs) getActivity()).aE();
        if (aE != null) {
            aE.d(12);
        }
        if (this.e.equals("Home")) {
            String string = getString(R.string.alias_editor_home_display);
            this.e = string;
            if (aE != null) {
                aE.a((CharSequence) getString(R.string.alias_editor_label_format, string));
            }
            ((ImageView) inflate.findViewById(R.id.address_icon)).setImageDrawable(getActivity().getResources().getDrawable(R.drawable.ic_qu_home));
        } else if (this.e.equals("Work")) {
            String string2 = getString(R.string.alias_editor_work_display);
            this.e = string2;
            if (aE != null) {
                aE.a((CharSequence) getString(R.string.alias_editor_label_format, string2));
            }
            ((ImageView) inflate.findViewById(R.id.address_icon)).setImageDrawable(getActivity().getResources().getDrawable(R.drawable.ic_qu_work));
        } else {
            this.e = getString(R.string.alias_editor_alias_display);
        }
        this.b.setText(getString(R.string.alias_editor_default_address_format, this.e));
        ((TextView) inflate.findViewById(R.id.disclaimer_text_view)).setText(getString(R.string.alias_editor_disclaimer_format, this.e));
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        MapView mapView = this.c;
        if (mapView != null) {
            mapView.c();
        }
    }

    public final void onLowMemory() {
        super.onLowMemory();
        this.c.d();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem != this.f) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (this.g == null) {
            this.g = new AlertDialog.Builder(getActivity()).setCancelable(true).setTitle(getString(R.string.alias_editor_confirmation_title, this.e)).setMessage(getString(R.string.alias_editor_confirmation_message, this.e)).setPositiveButton(R.string.alias_editor_delete_alias, new albk(this)).setNegativeButton(R.string.common_cancel, (DialogInterface.OnClickListener) null).create();
        }
        this.g.show();
        return true;
    }

    public final void onPause() {
        super.onPause();
        this.c.b();
    }

    public final void onResume() {
        this.c.a();
        super.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        TextView textView = this.b;
        if (textView != null) {
            bundle.putCharSequence("alias_address", textView.getText());
        }
        MapView mapView = this.c;
        if (mapView != null) {
            mapView.b(bundle);
        }
        super.onSaveInstanceState(bundle);
    }

    public final void onStart() {
        super.onStart();
        this.d = true;
    }

    public final void onStop() {
        super.onStop();
        this.d = false;
    }

    public final void a(rqn rqn) {
        Location lastKnownLocation;
        LocationManager locationManager = (LocationManager) getActivity().getSystemService("location");
        if (locationManager != null && (lastKnownLocation = locationManager.getLastKnownLocation("passive")) != null) {
            rqn.a(rqi.a(new LatLng(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude())));
        } else if (this.c.getWidth() > 0) {
            rqn.a(rqi.a(new LatLngBounds(new LatLng(-90.0d, -180.0d), new LatLng(90.0d, 180.0d)), this.c.getWidth(), this.c.getHeight()));
        }
    }
}
