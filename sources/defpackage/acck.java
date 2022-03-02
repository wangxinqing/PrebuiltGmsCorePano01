package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.smartdevice.d2d.ui.DeviceListItemView;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: acck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acck extends Fragment {
    public String a;
    public DeviceListItemView b;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.a = arguments.getString("deviceName");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.smartdevice_target_device_name_fragment, viewGroup, false);
        DeviceListItemView deviceListItemView = (DeviceListItemView) inflate.findViewById(R.id.device_item);
        this.b = deviceListItemView;
        deviceListItemView.a(this.a);
        DeviceListItemView deviceListItemView2 = this.b;
        deviceListItemView2.a(0.0f);
        deviceListItemView2.setBackgroundResource(R.drawable.smartdevice_rounded_background);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        GlifLayout glifLayout = (GlifLayout) view.findViewById(R.id.glif_layout);
        Activity activity = getActivity();
        if (glifLayout != null && activity != null) {
            acpc.a(activity.getContainerActivity(), glifLayout.e());
        }
    }
}
