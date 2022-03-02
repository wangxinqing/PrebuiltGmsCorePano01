package defpackage;

import android.accounts.Account;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.DialogInterface;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.libraries.bluetooth.fastpair.HeadsetPiece;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: mta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mta extends Fragment {
    public aoe a;
    public byte[] b;
    public String c;
    public MenuItem d;
    public View e;
    public TextView f;
    public TextView g;
    public mrh h;
    public arxb i;
    public mru j;
    final arxa k = new msy(this);
    private final ContentObserver l = new msx(this, "nearby", "FastPairDeviceDetailsFragment", new qvr());

    private static final String a(HeadsetPiece headsetPiece) {
        int b2 = headsetPiece.b();
        return !TrueWirelessHeadset.a(b2) ? "‒" : Integer.toString(b2);
    }

    public static final Executor g() {
        return jfm.b(10);
    }

    private final BluetoothDevice h() {
        String str;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || (str = this.c) == null) {
            ((anih) ((anih) mte.a.d()).a("mta", "h", 354, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceDetail: getRemoteBluetoothDevice with null variable, return null.");
            return null;
        }
        try {
            return defaultAdapter.getRemoteDevice(str);
        } catch (IllegalArgumentException e2) {
            return null;
        }
    }

    public final void b() {
        String str;
        if (this.e != null && e()) {
            TextView textView = (TextView) this.e.findViewById(R.id.description);
            try {
                TrueWirelessHeadset b2 = this.i.b(this.c);
                if (b2 != null) {
                    textView.setVisibility(0);
                    if (TrueWirelessHeadset.a(b2.d().b())) {
                        str = getString(R.string.fast_pair_device_details_battery_level, a(b2.b()), a(b2.d()), a(b2.c()));
                    } else {
                        str = getString(R.string.fast_pair_device_details_battery_level_no_case, a(b2.b()), a(b2.c()));
                    }
                    textView.setText(str);
                    textView.setContentDescription(aryk.a(b2, new msq(this, b2), new msr(this, b2), new mss(this, b2)));
                    return;
                }
            } catch (RemoteException e2) {
                anih anih = (anih) mte.a.c();
                anih.a((Throwable) e2);
                ((anih) anih.a("mta", "b", 253, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceDetail: RemoteException when try to getBatteryAdvertisement.");
            }
            int a2 = arww.a(this.c);
            if (TrueWirelessHeadset.a(a2)) {
                textView.setVisibility(0);
                textView.setText(getString(R.string.common_battery_level, Integer.valueOf(a2)));
                return;
            }
            textView.setVisibility(8);
        }
    }

    public final void c() {
        mrh mrh = this.h;
        if (mrh != null) {
            mrh.f.clear();
            try {
                mrh.a.a(mrh.e);
                mrh.f.addAll(mty.a(mrh.a.c(mrh.e)));
            } catch (IllegalArgumentException e2) {
                anih anih = (anih) mte.a.c();
                anih.a((Throwable) e2);
                ((anih) anih.a("mrh", "c", 48, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceDetailsSliceItemAdapter.updateSliceItem meet exception, optional module might not be installed.");
            }
            ((anih) ((anih) mte.a.d()).a("mrh", "c", 52, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("updateSliceItem called, Get slice items %d", mrh.f.size());
            mrh.as();
            return;
        }
        ((anih) ((anih) mte.a.c()).a("mta", "c", 282, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceDetail: deviceDetailsSliceItemAdapter is null when updateDetails.");
    }

    public final boolean e() {
        return !TextUtils.isEmpty(this.c);
    }

    public final String f() {
        TextView textView = this.f;
        if (textView != null) {
            return textView.getText().toString();
        }
        return null;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b = getArguments().getByteArray("account_key");
        this.a = aoe.a(getContext());
        mtd.a(getContext(), asom.FAST_PAIR_ACCOUNT_SETTINGS_DEVICE_ITEM_LAUNCHED);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.device_details_menu, menu);
        menuInflater.inflate(R.menu.devices_menu, menu);
        MenuItem findItem = menu.findItem(R.id.action_rename);
        this.d = findItem;
        findItem.setVisible(false);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fast_pair_fragment_device_details, viewGroup, false);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        bjs bjs = (bjs) getActivity();
        bjs.a(toolbar);
        toolbar.a((View.OnClickListener) new msm(this));
        sg aE = bjs.aE();
        aE.c((int) R.string.fast_pair_device_details_title);
        aE.b(true);
        aE.a(true);
        setHasOptionsMenu(true);
        this.e = inflate.findViewById(R.id.header);
        this.f = (TextView) inflate.findViewById(R.id.title);
        this.g = (TextView) inflate.findViewById(R.id.text_address);
        if (this.j == null) {
            this.j = new mru(getActivity());
        }
        g().execute(new msp(this));
        inflate.findViewById(R.id.forgetButton).setOnClickListener(new mso(this));
        this.i = new arxb(getContext(), this.k);
        return inflate;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_help) {
            mrl.a(getActivity());
            return true;
        } else if (menuItem.getItemId() != R.id.action_rename) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            View inflate = getLayoutInflater((Bundle) null).inflate(R.layout.dialog_edittext, (ViewGroup) null);
            EditText editText = (EditText) inflate.findViewById(R.id.edittext);
            editText.setFilters(new InputFilter[]{new arzl(248)});
            editText.setText(f());
            sr srVar = new sr(getContext());
            srVar.a((int) R.string.common_device_name);
            srVar.b(inflate);
            srVar.b((int) R.string.rename_bluetooth_device, (DialogInterface.OnClickListener) new msv(this, editText));
            srVar.a(17039360, (DialogInterface.OnClickListener) null);
            ss b2 = srVar.b();
            b2.setOnShowListener(new msw(this, b2, editText));
            b2.show();
            return true;
        }
    }

    public final void onPause() {
        arxb arxb = this.i;
        if (arxb != null) {
            arxb.b();
        }
        mrh mrh = this.h;
        if (mrh != null) {
            try {
                mrh.a.b(mrh.e);
            } catch (IllegalStateException | NullPointerException e2) {
                anih anih = (anih) mte.a.c();
                anih.a(e2);
                ((anih) anih.a("mrh", "d", 65, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceDetailsSliceItemAdapter.unpinSlice meet exception!");
            }
        }
        getContext().getContentResolver().unregisterContentObserver(this.l);
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        ((mrm) getActivity()).a(R.string.fast_pair_device_details_title);
        arxb arxb = this.i;
        if (arxb != null) {
            arxb.a();
        }
        getContext().getContentResolver().registerContentObserver(aehb.a, true, this.l);
        getContext().getContentResolver().registerContentObserver(aryo.a, true, this.l);
    }

    public void renameDevice(String str) {
        arww.a(this.c, str);
        TextView textView = this.f;
        if (textView != null) {
            textView.setText(str);
        }
        mtd.a(getContext(), asom.FAST_PAIR_DEVICE_RENAMED);
    }

    public static mta a(byte[] bArr) {
        mta mta = new mta();
        Bundle bundle = new Bundle();
        bundle.putByteArray("account_key", bArr);
        mta.setArguments(bundle);
        return mta;
    }

    public final void d() {
        String str;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        BluetoothDevice bluetoothDevice = null;
        if (defaultAdapter == null || (str = this.c) == null) {
            ((anih) ((anih) mte.a.d()).a("mta", "h", 354, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceDetail: getRemoteBluetoothDevice with null variable, return null.");
        } else {
            try {
                bluetoothDevice = defaultAdapter.getRemoteDevice(str);
            } catch (IllegalArgumentException e2) {
            }
        }
        if (e() && bluetoothDevice != null) {
            ((anih) ((anih) mte.a.d()).a("mta", "d", 329, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceDetail: Forget device %s by BluetoothDevice.removeBond", (Object) this.c);
            g().execute(new msu(this, bluetoothDevice));
            return;
        }
        ((anih) ((anih) mte.a.d()).a("mta", "d", 343, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceDetail: Forget device %s (should be null) by FootprintsDeviceManager.forgetDevice", (Object) this.c);
        arxt arxt = this.j.a;
        byte[] bArr = this.b;
        List a2 = arxt.a(arxt.b);
        int size = a2.size();
        int i2 = 0;
        while (i2 < size) {
            Account account = (Account) a2.get(i2);
            try {
                tzj a3 = arxt.a((List) arxt.a(account).get(), bArr);
                if (a3 == null) {
                    i2++;
                } else if ((a3.a & 4) == 0) {
                    ((anih) ((anih) aryq.a.c()).a("arxt", "a", 362, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: fail to forget footprints because device has no sha256.");
                    return;
                } else {
                    arxt.a(account, bArr, a3.d.k());
                    return;
                }
            } catch (InterruptedException | ExecutionException e3) {
                anih anih = (anih) aryq.a.c();
                anih.a(e3);
                ((anih) anih.a("arxt", "a", 368, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: fail to forget footprints.");
            }
        }
    }

    public final void a() {
        int i2;
        String str;
        arxb arxb;
        if (!e() && (arxb = this.i) != null) {
            try {
                this.c = arxb.a(this.b);
            } catch (RemoteException e2) {
                anih anih = (anih) mte.a.c();
                anih.a((Throwable) e2);
                ((anih) anih.a("mta", "a", 195, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceDetail: Get address from account key fail.");
            }
        }
        if (this.h == null && getView() != null) {
            RecyclerView recyclerView = (RecyclerView) getView().findViewById(R.id.sliceDetailsLink);
            getContext();
            recyclerView.setLayoutManager(new abk());
            Context context = getContext();
            aoe aoe = this.a;
            Uri.Builder appendPath = new Uri.Builder().scheme("content").authority("com.google.android.gms.nearby.fastpair").appendPath("links");
            if (e()) {
                appendPath.appendQueryParameter("address", this.c);
            } else if (this.b != null) {
                appendPath.appendQueryParameter("account_key", anml.g.a(this.b));
            }
            mrh mrh = new mrh(context, aoe, appendPath.build());
            this.h = mrh;
            recyclerView.setAdapter(mrh);
        }
        MenuItem menuItem = this.d;
        if (menuItem != null) {
            menuItem.setVisible(e());
        }
        b();
        TextView textView = this.g;
        if (textView != null) {
            if (!e()) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            textView.setVisibility(i2);
            TextView textView2 = this.g;
            if (e()) {
                str = getString(R.string.fast_pair_device_details_footer_address, this.c);
            } else {
                str = "";
            }
            textView2.setText(str);
        }
        c();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(BluetoothDevice bluetoothDevice) {
        try {
            aeic.a(bluetoothDevice).a("removeBond", new Class[0]).a(new Object[0]);
            mtd.a(getContext(), asom.FAST_PAIR_DEVICE_FORGOTTEN);
        } catch (aeid e2) {
            anih anih = (anih) mte.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("mta", "a", 337, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceDetail: Error removing bond for device=%s", (Object) bluetoothDevice);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(ss ssVar, EditText editText, DialogInterface dialogInterface) {
        Button a2 = ssVar.a(-1);
        a2.setEnabled(false);
        ((anih) ((anih) mte.a.d()).a("mta", "a", 444, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceDetail: show RenameDialog for device %s", (Object) this.c);
        editText.addTextChangedListener(new msz(this, a2));
    }

    public final void a(uaj uaj) {
        View view = this.e;
        if (view == null || this.f == null) {
            ((anih) ((anih) mte.a.c()).a("mta", "a", 181, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceDetail: UpdateHeader but view is null.");
            return;
        }
        ((ImageView) view.findViewById(R.id.icon)).setImageBitmap(mru.a(uaj));
        this.f.setText(uaj.h);
    }
}
