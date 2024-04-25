package com.scayle.storefrontapi.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AppliedReductionAmount implements ApiObjectInterface {
    @SerializedName("absoluteWithTax")
    Double absoluteWithTax;
    @SerializedName("relative")
    Double relative;
}
