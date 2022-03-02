package defpackage;

import android.content.Context;
import android.content.Intent;
import android.hardware.input.InputManager;
import android.os.Build;
import android.os.Handler;
import android.util.SparseIntArray;
import android.view.InputDevice;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jym implements InputManager.InputDeviceListener {
    public static final /* synthetic */ int c = 0;
    private static final int[] d = jyo.a((String) jyo.d.c());
    private static final int[] e = jyo.a((String) jyo.e.c());
    public final jyl a;
    public final InputManager b;
    private final Context f;
    private final jyn g;

    public jym(jyl jyl, Context context) {
        this.a = jyl;
        this.f = context;
        InputManager inputManager = (InputManager) context.getSystemService("input");
        this.b = inputManager;
        inputManager.getInputDevice(0);
        this.b.registerInputDeviceListener(this, (Handler) null);
        jyn jyn = new jyn(this);
        this.g = jyn;
        jyn.run();
    }

    private static final int a(InputDevice inputDevice, int... iArr) {
        boolean[] zArr;
        if (iArr == null || iArr.length == 0) {
            zArr = new boolean[]{false};
        } else {
            int i = Build.VERSION.SDK_INT;
            zArr = inputDevice.hasKeys(iArr);
        }
        for (int i2 = 0; i2 < zArr.length; i2++) {
            if (!zArr[i2]) {
                return i2;
            }
        }
        return iArr.length;
    }

    private static final SparseIntArray b(InputDevice inputDevice) {
        List<InputDevice.MotionRange> motionRanges = inputDevice.getMotionRanges();
        SparseIntArray sparseIntArray = new SparseIntArray(motionRanges.size());
        int size = motionRanges.size();
        for (int i = 0; i < size; i++) {
            InputDevice.MotionRange motionRange = motionRanges.get(i);
            sparseIntArray.put(motionRange.getAxis(), motionRange.getSource());
        }
        return sparseIntArray;
    }

    private static final boolean c(InputDevice inputDevice) {
        if (a(inputDevice, d) == d.length) {
            return true;
        }
        SparseIntArray b2 = b(inputDevice);
        if (b2.indexOfKey(15) < 0 || b2.indexOfKey(16) < 0) {
            return false;
        }
        return true;
    }

    public final void onInputDeviceAdded(int i) {
        InputDevice inputDevice = this.b.getInputDevice(i);
        if (inputDevice != null) {
            this.a.a(a(inputDevice));
            Intent intent = new Intent("com.google.android.gms.deviceconnection.input_device_connected");
            intent.setPackage("com.google.android.gms");
            intent.putExtra("input_device_id", i);
            this.f.sendBroadcast(intent);
        }
    }

    public final void onInputDeviceChanged(int i) {
        InputDevice inputDevice = this.b.getInputDevice(i);
        if (inputDevice != null) {
            this.a.a(a(inputDevice));
        }
    }

    public final void onInputDeviceRemoved(int i) {
        Intent intent = new Intent("com.google.android.gms.deviceconnection.input_device_disconnected");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("input_device_id", i);
        this.f.sendBroadcast(intent);
    }

    private static final boolean a(InputDevice inputDevice, int i) {
        return (inputDevice.getSources() & i) == i;
    }

    public final String[] a(InputDevice inputDevice) {
        ArrayList arrayList = new ArrayList();
        if (c(inputDevice)) {
            arrayList.add("android.hardware.dpad");
        }
        if (a(inputDevice, 65540)) {
            arrayList.add("android.hardware.trackball");
        }
        if (a(inputDevice, 1048584)) {
            arrayList.add("android.hardware.touchpad");
        }
        if (c(inputDevice) && a(inputDevice, e) >= e.length) {
            SparseIntArray b2 = b(inputDevice);
            if ((b2.get(22) == 16777232 || b2.get(18) == 16777232) && ((b2.get(23) == 16777232 || b2.get(17) == 16777232) && b2.get(0) == 16777232 && b2.get(1) == 16777232 && b2.get(11) == 16777232 && b2.get(14) == 16777232)) {
                arrayList.add("android.hardware.gamepad");
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
