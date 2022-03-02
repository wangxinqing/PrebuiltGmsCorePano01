package com.google.android.gms.vision.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.vision.barcode.internal.client.BarcodeDetectorOptions;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DynamiteNativeBarcodeDetectorCreator extends advs {
    public advq newBarcodeDetector$ar$class_merging(mby mby, BarcodeDetectorOptions barcodeDetectorOptions) {
        Context a = hep.a((Context) mbz.a(mby), "com.google.android.gms.vision.dynamite");
        if (a != null) {
            advt asInterface = advs.asInterface(hep.a(a.getClassLoader(), "com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator"));
            if (asInterface != null) {
                return asInterface.newBarcodeDetector$ar$class_merging(mby, barcodeDetectorOptions);
            }
            advo.a("Could not load Chimera native barcode detector creator.", new Object[0]);
            throw new RemoteException();
        }
        advo.a("%s could not be loaded.", "com.google.android.gms.vision.dynamite");
        throw new RemoteException();
    }
}
