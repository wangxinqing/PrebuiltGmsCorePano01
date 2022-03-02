package defpackage;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.IntentSender;
import android.location.LocationManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.setupdesign.GlifListLayout;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: acnt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acnt extends Fragment implements acqm, acol {
    public static final iwd a = acqa.a("Setup", "UI", "SelectWifiFragment");
    private static final Pattern f = Pattern.compile(".*");
    private static final LocationRequest g = LocationRequest.a();
    public ackb b;
    public acns c;
    public final Object d = new Object();
    public acqk e;
    private final Map h = new HashMap();
    private final Set i = new HashSet();
    private acqn j;
    private WifiManager k;
    private String l;
    private boolean m;
    private GlifListLayout n;
    private ListView o;
    private View p;
    private View q;
    private Button r;
    private iby s;

    public static acnt b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("smartdevice.title", str);
        bundle.putBoolean("smartdevice.isWifiOptional", false);
        acnt acnt = new acnt();
        acnt.setArguments(bundle);
        return acnt;
    }

    public final void a() {
        if (azma.b() && !this.k.isWifiEnabled()) {
            this.k.setWifiEnabled(true);
        }
    }

    public final void c() {
        rep rep = new rep();
        rep.b = true;
        rep.a(g);
        iby iby = this.s;
        LocationSettingsRequest a2 = rep.a();
        iha b2 = ihb.b();
        b2.a = new rez(a2, "com.google.android.gms");
        acwa a3 = iby.a(b2.a());
        a3.a(acnk.a);
        a3.a((acvs) new acnl(this));
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 != 4) {
            iwd iwd = a;
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unknown request code: ");
            sb.append(i2);
            iwd.d(sb.toString(), new Object[0]);
        } else if (i3 == -1) {
            a.a("Location enabled successfully.", new Object[0]);
        } else if (i3 == 0) {
            a.e("Enabling location was canceled by user.", new Object[0]);
            a(true);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.c = (acns) activity;
        } catch (ClassCastException e2) {
            throw new RuntimeException("Containing activity must implement SelectWifiFragment.Listener", e2);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Activity activity = getActivity();
        if (activity != null) {
            this.s = ren.b(activity);
            this.j = new acqn(activity, f, this);
            this.e = new acqk(activity);
            this.k = (WifiManager) activity.getApplicationContext().getSystemService("wifi");
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.l = arguments.getString("smartdevice.title");
                this.m = arguments.getBoolean("smartdevice.isWifiOptional");
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.n = (GlifListLayout) layoutInflater.inflate(R.layout.smartdevice_wifi_list, viewGroup, false);
        this.q = layoutInflater.inflate(R.layout.smartdevice_wifi_enable_location_services, viewGroup, false);
        return this.n;
    }

    public final void onPause() {
        this.j.b();
        this.h.clear();
        super.onPause();
    }

    public final void onResume() {
        boolean z;
        int i2;
        super.onResume();
        Activity activity = getActivity();
        if (activity != null) {
            LocationManager locationManager = (LocationManager) activity.getSystemService("location");
            if ((locationManager == null || (!locationManager.isProviderEnabled("gps") && !locationManager.isProviderEnabled("network"))) && jkr.b()) {
                z = true;
            } else {
                z = false;
            }
            if (azma.b() ? z || !this.k.isWifiEnabled() : z) {
                if (!azma.b()) {
                    i2 = R.string.smartdevice_wifi_unavailable_due_to_location_text;
                } else {
                    i2 = R.string.smartdevice_wifi_unavailable_text;
                }
                new AlertDialog.Builder(activity.getContainerActivity()).setTitle(R.string.smartdevice_wifi_unavailable_due_to_location_title).setMessage(i2).setPositiveButton(R.string.common_turn_on, new acnq(this)).setNegativeButton(R.string.common_cancel, new acnp(this)).setCancelable(false).show();
                return;
            }
            b();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!TextUtils.isEmpty(this.l)) {
            this.n.a((CharSequence) this.l);
        }
        this.b = new ackb(view.getContext());
        ListView a2 = this.n.a();
        this.o = a2;
        a2.setAdapter(this.b);
        this.o.setOnItemClickListener(new acnm(this));
        View view2 = new View(view.getContext());
        this.p = view2;
        view2.setLayoutParams(new AbsListView.LayoutParams(-2, getResources().getDimensionPixelSize(R.dimen.sud_items_padding_vertical)));
        Button button = (Button) this.q.findViewById(R.id.enable_location);
        this.r = button;
        button.setOnClickListener(new acnn(this));
        a(false);
        if (this.m) {
            throw new UnsupportedOperationException("Skipping wifi is not implemented yet");
        }
    }

    public final void a(Exception exc) {
        if (!(exc instanceof icj)) {
            a.d("Unresolvable exception", exc, new Object[0]);
            return;
        }
        Activity activity = getActivity();
        if (activity == null) {
            a.f("Activity not available", new Object[0]);
            return;
        }
        try {
            ((icj) exc).a(activity.getContainerActivity(), 4);
        } catch (IntentSender.SendIntentException e2) {
            a.a((Throwable) e2);
        }
    }

    public final void b() {
        List<WifiConfiguration> a2 = this.e.a();
        iva.a((Object) a2);
        for (WifiConfiguration wifiConfiguration : a2) {
            if (wifiConfiguration.hiddenSSID) {
                this.i.add(acqc.b(wifiConfiguration.SSID));
            } else {
                this.h.put(acqc.b(wifiConfiguration.SSID), wifiConfiguration);
            }
        }
        this.j.a();
    }

    public final void a(String str) {
        acom.a(str, false).show(getChildFragmentManager(), "dialog");
    }

    public final void a(String str, String str2) {
        this.c.a(str, str2, 5, 10, this.b.getCount());
    }

    public final void a(Set set) {
        String str;
        int i2;
        WifiInfo connectionInfo = this.e.b.getConnectionInfo();
        if (connectionInfo != null) {
            str = amrk.b(acqc.b(connectionInfo.getSSID()));
        } else {
            str = "";
        }
        synchronized (this.d) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ScanResult scanResult = (ScanResult) it.next();
                if (!TextUtils.isEmpty(scanResult.SSID) && !this.i.contains(scanResult.SSID)) {
                    if (!str.equals(scanResult.SSID)) {
                        i2 = this.h.keySet().contains(scanResult.SSID) ? 11 : 10;
                    } else {
                        i2 = 12;
                    }
                    ackb ackb = this.b;
                    acov acov = new acov(scanResult, i2);
                    synchronized (ackb.a) {
                        ackb.b.put(acov.a, acov);
                    }
                }
            }
        }
        this.b.notifyDataSetChanged();
    }

    public final void a(boolean z) {
        int i2 = Build.VERSION.SDK_INT;
        if (z) {
            TextView textView = (TextView) this.q.findViewById(R.id.body);
            Button button = (Button) this.q.findViewById(R.id.enable_location);
            if (azma.b()) {
                textView.setText(R.string.smartdevice_wifi_unavailable_text);
                button.setText(R.string.common_turn_on);
            } else {
                textView.setText(R.string.smartdevice_wifi_unavailable_due_to_location_text);
                button.setText(R.string.smartdevice_action_turn_on_location);
            }
            this.o.setHeaderDividersEnabled(false);
            this.o.addHeaderView(this.q);
            this.o.removeHeaderView(this.p);
        } else {
            this.o.setHeaderDividersEnabled(true);
            this.o.removeHeaderView(this.q);
            this.o.addHeaderView(this.p);
        }
        int i3 = Build.VERSION.SDK_INT;
    }
}
