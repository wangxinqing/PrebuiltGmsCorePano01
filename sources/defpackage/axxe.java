package defpackage;

/* renamed from: axxe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface axxe {
    boolean chreArAudioDiagnosticsLog();

    boolean chreArAudioEnableAudioBasedCarExit();

    boolean chreArAudioEnableAudioFusion();

    double chreArAudioMinAudioCarClassificationConfidence();

    double chreArAudioMinAudioNoncarClassificationConfidence();

    long chreArAudioMinBufferedMotionClassificationsCar();

    long chreArAudioMinBufferedMotionClassificationsOnfoot();

    long chreArAudioMinBufferedMotionClassificationsStill();

    long chreArAudioMinContinuousAudioClassificationsCar();

    long chreArAudioMinContinuousAudioClassificationsNoncar();

    long chreArAudioMinContinuousMotionClassificationsBicycle();

    long chreArAudioMinContinuousMotionClassificationsCar();

    long chreArAudioMinContinuousMotionClassificationsOnfoot();

    long chreArAudioMinContinuousMotionClassificationsStill();

    double chreArAudioMinMotionBicycleClassificationConfidence();

    double chreArAudioMinMotionCarClassificationConfidence();

    double chreArAudioMinMotionOnfootClassificationConfidence();

    double chreArAudioMinMotionStillClassificationConfidence();

    double chreArAudioMinPressurePeakSpikeBackDelta();

    double chreArAudioMinPressurePeakSpikeThreshold();

    long chreArAudioTimeIntervalThresholdForPressurePeakMillis();

    boolean chreArAudioVerbose();

    long chreArDeepStillIntervalExitMillis();

    boolean chreArEnableMultimodalModelBasedExitTransition();

    long chreArMaxLastVehicleDetectionIntervalForAllStillMillis();

    long chreArMaxLastVehicleDetectionIntervalForOtherTransitionMillis();

    long chreArOnfootRecencyTimeIntervalMillis();

    boolean enableAudioChreWifiFiltering();

    boolean enableCarExitOnIdle();

    boolean enableConnectedWifiFilterAudioFusion();

    boolean enableDrivingDndExitWithAudioFusion();

    boolean enableDrivingDndWithAudioFusion();

    boolean enableDrivingDndWithRoadRail();

    String firstPartyAudioEnabledPackageWhitelist();

    long flexAudioFusion();

    boolean onlyRelyOnCarTransitionStateMachine();

    String zeroPartyAudioEnabledTagWhitelist();
}
