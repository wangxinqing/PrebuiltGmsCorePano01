package defpackage;

import android.content.Context;
import com.google.android.gms.mdm.LockscreenChimeraActivity;
import com.google.android.gms.mdm.LockscreenChimeraActivityPermissionTrampoline;
import com.google.android.gms.mdm.receivers.GoogleAccountsAddedChimeraReceiver;
import com.google.android.gms.mdm.receivers.MdmDeviceAdminChimeraReceiver;
import com.google.android.gms.mdm.receivers.RetryAfterAlarmChimeraReceiver;
import com.google.android.gms.mdm.services.DeviceManagerApiChimeraService;
import com.google.android.gms.mdm.services.GcmReceiverChimeraService;
import com.google.android.gms.mdm.services.LockscreenMessageChimeraService;
import com.google.android.gms.mdm.services.MdmPhoneWearableListenerChimeraService;
import com.google.android.gms.mdm.services.RingChimeraService;
import java.util.ArrayList;

/* renamed from: smg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class smg {
    static final Class[] a = {LockscreenChimeraActivity.class, LockscreenChimeraActivityPermissionTrampoline.class, MdmDeviceAdminChimeraReceiver.class, RetryAfterAlarmChimeraReceiver.class, DeviceManagerApiChimeraService.class, GcmReceiverChimeraService.class, LockscreenMessageChimeraService.class, MdmPhoneWearableListenerChimeraService.class, RingChimeraService.class};

    public static void a(Context context) {
        Class[] clsArr = a;
        ArrayList arrayList = new ArrayList();
        for (Class cls : clsArr) {
            boolean z = true;
            if (jix.a(context) && !arrayList.contains(cls)) {
                z = false;
            }
            jhg.a(context, cls.getCanonicalName().replace("Chimera", ""), z);
        }
        if (!jix.a(context)) {
            int i = crc.a;
            GoogleAccountsAddedChimeraReceiver.b();
        }
    }
}
