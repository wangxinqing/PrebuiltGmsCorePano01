package defpackage;

/* renamed from: ayba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface ayba {
    boolean fopEnableInertialAnchorOrientationEngineV2();

    boolean fopEventLogsSetClientFixEnable();

    long fopInertialAnchorConfigurationIndex();

    long fopInertialAnchorEmpiricalHeadingUncertaintyModelConfigIndex();

    boolean fopInertialAnchorUseDeclinationBugfix119882623();

    boolean fopInertialAnchorUseHeadingUncertaintyModelConfig();

    boolean fopInertialAnchorUseNanBugfix120491249();

    boolean fopInertialAnchorUseStatefulLogging();

    long fopLogCollectionPeriodMs();

    double fopLogSamplingRate();

    boolean fopLogsCheckConsent();

    long fopMaxErrorDegreesHighAccuracy();

    long fopMaxErrorDegreesLowAccuracy();

    long fopMaxErrorDegreesMediumAccuracy();

    long fopMinChangeErrorDegreesForLevelUpdate();

    double fopRequestLogSamplingRate();

    long fopSensorSamplingPeriodMilliseconds();

    boolean fopUseInertialAnchor();
}
