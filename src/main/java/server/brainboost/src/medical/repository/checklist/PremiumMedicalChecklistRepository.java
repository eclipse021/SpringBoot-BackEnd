package server.brainboost.src.medical.repository.checklist;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import server.brainboost.src.medical.entity.checklist.PremiumMedicalChecklistEntity;
import server.brainboost.src.user.entity.UserEntity;

public interface PremiumMedicalChecklistRepository extends JpaRepository<PremiumMedicalChecklistEntity, Long> {

	Boolean existsByUser(UserEntity user);

	Optional<PremiumMedicalChecklistEntity> findPremiumMedicalChecklistEntityByUser(UserEntity user);
}
