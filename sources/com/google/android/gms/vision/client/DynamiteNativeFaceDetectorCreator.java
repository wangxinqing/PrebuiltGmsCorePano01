package com.google.android.gms.vision.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.vision.face.internal.client.FaceSettingsParcel;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DynamiteNativeFaceDetectorCreator extends advz {
    public advx newFaceDetector$ar$class_merging(mby mby, FaceSettingsParcel faceSettingsParcel) {
        Context a = hep.a((Context) mbz.a(mby), "com.google.android.gms.vision.dynamite");
        if (a != null) {
            adwa asInterface = advz.asInterface(hep.a(a.getClassLoader(), "com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"));
            if (asInterface != null) {
                return asInterface.newFaceDetector$ar$class_merging(mby, faceSettingsParcel);
            }
            advo.a("Could not load Chimera native face detector creator.", new Object[0]);
            throw new RemoteException();
        }
        advo.a("%s could not be loaded.", "com.google.android.gms.vision.dynamite");
        throw new RemoteException();
    }
}
