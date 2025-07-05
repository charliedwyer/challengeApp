package com.cd.challengeApp.ChallengeApp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/challenges")
public class ChallengeController {

    private ChallengeService challengeService;

    public ChallengeController(ChallengeService challengeService) {
        this.challengeService = challengeService;
    }

    @GetMapping
    public ResponseEntity<List<Challenge>> getAllChallenges() {return new ResponseEntity<>(challengeService.getAllChallenges(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> addChallenge(@RequestBody Challenge challenge) {
        boolean isChallengeAdded = challengeService.addChallenge(challenge);
        if (isChallengeAdded) {
            return new ResponseEntity<>("Challenge Added Successfully", HttpStatus.OK);
        } else {
            return  new ResponseEntity<>("Challenge not added successfully", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{month}")
    public ResponseEntity<Challenge> getAChallenge(@PathVariable String month) {
        Challenge challenge = challengeService.getChallenge(month);
        if (challenge != null) {
            return new ResponseEntity<>(challenge, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateChallenge(@PathVariable Long id, @RequestBody Challenge updatedChallenge) {
        boolean isChallengeUpdated = challengeService.updateChallenge(id, updatedChallenge);
        if (isChallengeUpdated) {
            return new ResponseEntity<>("Challenge Updated Successfully", HttpStatus.OK);
        } else {
            return  new ResponseEntity<>("Challenge not updated successfully", HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteChallenge(@PathVariable Long id) {
        boolean isChallengeDeleted = challengeService.deleteChallenge(id);
        if (isChallengeDeleted) {
            return new ResponseEntity<>("Challenge deleted Successfully", HttpStatus.OK);
        } else {
            return  new ResponseEntity<>("Challenge not deleted successfully", HttpStatus.NOT_FOUND);
        }
    }
}
