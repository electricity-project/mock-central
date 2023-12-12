package com.example.mockcentral;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@SuperBuilder
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PowerStation {
    private Long id;
    @NonNull private String ipv6;
    @NonNull private String state;
    @NonNull private LocalDateTime creationTime;
    @NonNull private double maxPower;
}
