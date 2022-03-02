package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: albv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class albv extends Fragment implements akzh, akzu, alai, alah {
    public albu a;
    public akzz b;
    public akzj c;
    public boolean d;
    public boolean e;
    public boolean f;
    public rhq g;
    public CameraPosition h;
    public rhq i;
    private boolean j;
    private TextView k;
    private TextView l;
    private rhq[] m;
    private MenuItem n;
    private ixk o;

    private final void e() {
        a((int) R.string.alias_editor_updating_location);
        akzj akzj = this.c;
        if (!akzj.u) {
            akzj.u = true;
            akzj.getView().setVisibility(4);
            akzj.a(false);
            akzj.b(false);
            View view = akzj.j;
            if (view != null) {
                view.setVisibility(4);
            }
        }
        this.c.c(true);
    }

    public final void a() {
        if (this.e) {
            this.e = false;
            this.c.f();
            Toast.makeText(getActivity(), R.string.places_ui_no_current_location_toast, 0).show();
        }
    }

    public final void b() {
        if (this.e) {
            this.e = false;
            this.c.f();
            Toast.makeText(getActivity(), R.string.places_ui_no_current_location_toast, 0).show();
            c();
        }
    }

    public final void c() {
        this.g = null;
        this.c.a(true);
        if (this.c.c() != null) {
            this.b.a(this.c.c());
        } else if (getView() != null) {
            alan.a(getView(), (Runnable) new albs(this));
        } else if (Log.isLoggable("Places", 5)) {
            Log.w("Places", "Alias Editor is skipping reverse geocode because it has no view.");
            return;
        } else {
            return;
        }
        albt albt = new albt(this);
        this.f = true;
        new qvr(Looper.getMainLooper()).postDelayed(albt, (long) ((int) azcc.a.a().g()));
    }

    public final LatLngBounds d() {
        akzj akzj = this.c;
        if (akzj == null) {
            return new LatLngBounds(new LatLng(-90.0d, -180.0d), new LatLng(90.0d, 180.0d));
        }
        return akzj.d();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        akyp.a(getActivity(), getArguments().getInt("primary_color"), getArguments().getInt("primary_color_dark"), getArguments().getInt("text_color"));
        if (bundle != null) {
            this.i = PlaceEntity.a(bundle.getParcelable("marked_place"), getActivity());
            Parcelable[] parcelableArray = bundle.getParcelableArray("places_on_map");
            if (parcelableArray != null) {
                this.m = new rhq[parcelableArray.length];
                for (int i2 = 0; i2 < parcelableArray.length; i2++) {
                    this.m[i2] = PlaceEntity.a(parcelableArray[i2], getActivity());
                }
            }
        }
        alan.a(getView(), (Runnable) new albq(this));
        String a2 = jhg.a(getActivity());
        ClientContext clientContext = new ClientContext();
        clientContext.e = a2;
        try {
            clientContext.b = jni.b(getActivity()).a(a2, 0).uid;
            this.o = ixk.a((Context) getActivity(), clientContext);
        } catch (PackageManager.NameNotFoundException e2) {
            if (Log.isLoggable("Places", 6)) {
                String valueOf = String.valueOf(a2);
                Log.e("Places", valueOf.length() == 0 ? new String("Failed to get app info for caller: ") : "Failed to get app info for caller: ".concat(valueOf));
            }
            getActivity().setResult(2);
            getActivity().finish();
        }
    }

    public final void onCreate(Bundle bundle) {
        setRetainInstance(true);
        super.onCreate(bundle);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.alias_editor_pick_a_place_menu_map, menu);
        MenuItem findItem = menu.findItem(R.id.alias_editor_menu_search);
        this.n = findItem;
        if (findItem != null) {
            Activity activity = getActivity();
            MenuItem menuItem = this.n;
            int i2 = getArguments().getInt("text_color");
            if (akyp.a(activity) != null) {
                Drawable drawable = activity.getResources().getDrawable(R.drawable.ic_search);
                akyp.a(drawable, i2);
                menuItem.setIcon(drawable);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(R.layout.alias_editor_pick_a_place_fragment, viewGroup, false);
        akzj akzj = (akzj) getChildFragmentManager().findFragmentByTag("marker_map_tag");
        this.c = akzj;
        if (akzj == null) {
            this.c = new akzj();
            getChildFragmentManager().beginTransaction().add(R.id.map_fragment_frame, this.c, "marker_map_tag").commit();
        }
        this.c.d = akyr.a((Context) getActivity());
        this.c.t = this;
        this.j = true;
        this.k = (TextView) inflate.findViewById(R.id.address_view);
        inflate.findViewById(R.id.cancel_button).setOnClickListener(new albo(this));
        TextView textView = (TextView) inflate.findViewById(R.id.update_button);
        this.l = textView;
        textView.setOnClickListener(new albp(this));
        this.l.setClickable(false);
        if (bundle == null) {
            this.g = PlaceEntity.a(getArguments().getParcelable("selected_place"), getActivity());
        } else {
            this.g = PlaceEntity.a(bundle.getParcelable("selected_place"), getActivity());
            this.h = (CameraPosition) bundle.getParcelable("map_camera_position");
        }
        ((bjs) getActivity()).aE().d(12);
        return inflate;
    }

    public final void onDestroyView() {
        if (this.c != null) {
            getChildFragmentManager().beginTransaction().remove(this.c).commitAllowingStateLoss();
        }
        super.onDestroyView();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.alias_editor_menu_search) {
            return super.onOptionsItemSelected(menuItem);
        }
        albu albu = this.a;
        if (albu == null) {
            return true;
        }
        albu.j();
        return true;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        akzj akzj = this.c;
        if (akzj != null) {
            bundle.putParcelable("map_camera_position", akzj.e());
        }
        rhq rhq = this.g;
        if (rhq != null) {
            bundle.putParcelable("selected_place", (PlaceEntity) rhq);
        }
        rhq rhq2 = this.i;
        if (rhq2 != null) {
            bundle.putParcelable("marked_place", (PlaceEntity) rhq2);
        }
        rhq[] rhqArr = this.m;
        if (rhqArr != null) {
            Parcelable[] parcelableArr = new Parcelable[rhqArr.length];
            int i2 = 0;
            while (true) {
                rhq[] rhqArr2 = this.m;
                if (i2 < rhqArr2.length) {
                    parcelableArr[i2] = (PlaceEntity) rhqArr2[i2];
                    i2++;
                } else {
                    bundle.putParcelableArray("places_on_map", parcelableArr);
                    return;
                }
            }
        }
    }

    public final void onStart() {
        int i2;
        boolean z;
        super.onStart();
        if (this.o != null) {
            if (azcx.b()) {
                i2 = this.o.a("android.permission.ACCESS_FINE_LOCATION", false);
            } else {
                i2 = this.o.a("android.permission.ACCESS_FINE_LOCATION");
            }
            akzj akzj = this.c;
            if (i2 == -1 || i2 == -2) {
                z = false;
            } else {
                z = true;
            }
            if (akzj.v != z) {
                akzj.v = z;
                akzj.e.a((rqs) new akyz(akzj));
                if (akzj.v) {
                    akzj.j = akzj.getView().findViewById(R.id.marker_map_my_location_button);
                    akzj.h();
                    akzj.j.setVisibility(0);
                } else {
                    View view = akzj.j;
                    if (view != null) {
                        view.setVisibility(8);
                        akzj.j = null;
                    }
                }
            }
            this.b.e = this;
            if (this.g != null) {
                if (this.j) {
                    this.j = false;
                    String string = getArguments().getString("calling_package");
                    int i3 = getArguments().getInt("overlay_resource_id");
                    if (!(string == null || i3 == 0)) {
                        int i4 = getArguments().getInt("overlay_width");
                        int i5 = getArguments().getInt("overlay_height");
                        akzj akzj2 = this.c;
                        if (i3 > 0 && i4 > 0 && i5 > 0) {
                            try {
                                Resources resourcesForApplication = akzj2.getActivity().getPackageManager().getResourcesForApplication(string);
                                akzj2.p = ruw.a(BitmapFactory.decodeResource(resourcesForApplication, i3));
                                akzj2.q = resourcesForApplication.getDrawable(i3);
                                akzj2.r = i4;
                                akzj2.s = i5;
                                akzj2.i.setImageDrawable(akzj2.q);
                                akzj2.i.setVisibility(0);
                            } catch (PackageManager.NameNotFoundException e2) {
                                akzj2.q = null;
                                akzj2.p = null;
                                akzj2.i.setVisibility(8);
                                if (Log.isLoggable("Places", 6)) {
                                    StringBuilder sb = new StringBuilder(string.length() + 91);
                                    sb.append("Could not find reference marker overlay resource for package: ");
                                    sb.append(string);
                                    sb.append(", and resourceId: ");
                                    sb.append(i3);
                                    alfy.a("Places", sb.toString());
                                }
                            }
                        } else {
                            if (Log.isLoggable("Places", 6) && i3 > 0) {
                                alfy.a("Places", "Invalid width or height for reference marker overlay");
                            }
                            akzj2.q = null;
                            akzj2.p = null;
                            akzj2.i.setVisibility(8);
                        }
                    }
                }
                if (!this.e) {
                    CameraPosition cameraPosition = this.h;
                    if (cameraPosition != null) {
                        akzj akzj3 = this.c;
                        akzj3.e.a((rqs) new akze(akzj3, cameraPosition));
                    } else {
                        this.c.a(this.g.d());
                    }
                    if (this.m != null) {
                        akzj akzj4 = this.c;
                        akzj4.e.a((rqs) new akys(akzj4));
                        akzj akzj5 = this.c;
                        rhq[] rhqArr = this.m;
                        if (rhqArr != null) {
                            akzj5.e.a((rqs) new akyt(akzj5, rhqArr));
                        }
                        this.c.a(false);
                    }
                    rhq rhq = this.i;
                    if (rhq != null) {
                        this.c.a(rhq);
                        this.c.a(false);
                        a(this.i);
                        return;
                    }
                    this.c.a(true);
                    a(this.g);
                    return;
                }
                e();
                return;
            }
            this.e = true;
            e();
        }
    }

    public final void onStop() {
        this.b.a();
        this.b.e = null;
        super.onStop();
    }

    public final void a(int i2) {
        this.k.setText(i2);
    }

    public final void b(rhq[] rhqArr) {
        rhq rhq = rhqArr[0];
        if (rhq != null) {
            this.m = rhqArr;
            this.i = rhq;
            this.h = new CameraPosition(rhq.d(), 17.0f, 0.0f, 0.0f);
            getActivity().onBackPressed();
        }
    }

    public final void a(LatLng latLng) {
        this.c.f();
        if (this.e) {
            this.e = false;
            this.c.f();
            this.c.a(latLng);
            return;
        }
        akzj akzj = this.c;
        akzj.e.a((rqs) new akzg(akzj, latLng));
    }

    public final void a(rhq rhq) {
        String str;
        iva.a("setCurrentAddress must be called on the UI thread!");
        this.g = rhq;
        if (rhq != null) {
            this.l.setClickable(true);
            this.l.setTextColor(getActivity().getResources().getColor(R.color.alias_editor_button_enabled));
        } else {
            this.l.setClickable(false);
            this.l.setTextColor(getActivity().getResources().getColor(R.color.alias_editor_button_disabled));
        }
        if (rhq != null && !TextUtils.isEmpty(rhq.q())) {
            str = rhq.q().toString();
        } else if (rhq != null && !TextUtils.isEmpty(rhq.p())) {
            str = rhq.p().toString();
        } else {
            str = getString(R.string.common_unknown);
        }
        this.k.setText(str);
    }
}
